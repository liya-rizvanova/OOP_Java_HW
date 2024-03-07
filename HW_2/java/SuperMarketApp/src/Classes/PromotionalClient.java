package Classes;

import java.util.List;

import Interfaces.iRefundBehaviour;
import Utils.Logger;

public class PromotionalClient extends Actor implements iRefundBehaviour {
    private String promotionName;
    private static int participantsCount;
    private int clientId;

    public PromotionalClient(String name, int clientId, String promotionName) {
        super(name);
        this.clientId = clientId;
        this.promotionName = promotionName;
        participantsCount++;
    }

    public int getClientId() {
        return clientId;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public static int getParticipantsCount() {
        return participantsCount;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
   
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder; 
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;        
    }

    public Actor geActor() {
        return this;
    }

    @Override
    public void refundOrder(List<Actor> actors) {
        // Реализация возврата товара для акционного клиента
    }

    public void refundOrder() {
        // Реализация возврата товара для акционного клиента
        Logger.log(getName() + " акционный клиент вернул товар ");
    }
}