package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iMarcketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iRefundBehaviour;
import Utils.Logger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Market implements iMarcketBehaviour, iQueueBehaviour, iRefundBehaviour {
    private List<iActorBehaviour> queue;
    private static final int MAX_PARTICIPANTS = 100; // Максимальное количество участников акции
    private Set<Integer> participantsSet; // Хранение id участников акции

    public Market() {
        this.queue = new ArrayList<>();
        this.participantsSet = new HashSet<>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        if (actor instanceof PromotionalClient) {
            PromotionalClient promoClient = (PromotionalClient) actor;
            if (!isAlreadyParticipant(promoClient) && participantsSet.size() >= MAX_PARTICIPANTS) {
                Logger.log("Извините, превышено максимальное количество участников акции. " +
                        "Акционному клиенту " + promoClient.geActor().getName() + " отказано в обслуживании.");
                return;
            }
        }

        Logger.log(actor.geActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    private boolean isAlreadyParticipant(PromotionalClient client) {
        return participantsSet.contains(client.getClientId());
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        Logger.log(actor.geActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            Logger.log(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
            if (actor instanceof PromotionalClient) {
                participantsSet.remove(((PromotionalClient) actor).getClientId());
            }
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                Logger.log(actor.geActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                Logger.log(actor.geActor().getName() + " клиент ушел из очереди ");
            }
        }
        refundOrder(releaseActors);
        releseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                Logger.log(actor.geActor().getName() + " клиент сделал заказ ");
                if (actor instanceof PromotionalClient) {
                    participantsSet.add(((PromotionalClient) actor).getClientId());
                }
            }
        }
    }

    @Override
    public void refundOrder(List<Actor> actors) {
        for (Actor actor : actors) {
            Logger.log(actor.getName() + " клиент вернул товар ");
        }
    }
    
}