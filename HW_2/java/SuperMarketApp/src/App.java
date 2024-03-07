import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Masha");
        iActorBehaviour client3 = new SpecialClient("Prezident", 1);
        iActorBehaviour client4 = new TaxInspector();
        iActorBehaviour client5 = new PromotionalClient("Deniz",555, "Discount Campaigne");
        iActorBehaviour client6 = new PromotionalClient("Andie",989, "Discount Campaigne");
        iActorBehaviour client7 = new PromotionalClient("Julia",111, "Discount Campaigne");
        iActorBehaviour client8 = new PromotionalClient("Ben",118, "Discount Campaigne");


        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);
        magnit.acceptToMarket(client8);
        

        magnit.update();
    }
}
