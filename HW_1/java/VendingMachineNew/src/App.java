import Domain.Bottle;
import Domain.HotDrinks;
import Domain.Product;
import Service.CoinDispencer;
import Service.Display;
import Service.Holder;
import Service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(100.0, 1, "Lays", 90, "g");
        Product item2 = new Product(80.0, 2, "Nuts", 50, "g");
        Product item3 = new Product(40.0, 3, "Mars", 30, "g");
        Product item4 = new Bottle(14.5, 4, "Cola", 0.5f, "ml");
        Product item5 = new Bottle(20.5, 5, "Mineral", 0.5f, "ml");
        Product item6 = new HotDrinks(10.5, 6, "Espresso", 0.3f, "ml", 70);
        Product item7 = new HotDrinks(12.5, 7, "Cappuccino", 0.3f, "ml", 75);
        Product item8 = new HotDrinks(12.0, 8, "Mocha", 0.3f, "ml", 65);

        List<Product> products = new ArrayList<>();
        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);
        products.add(item5);
        products.add(item6);
        products.add(item7);
        products.add(item8);

        Holder hold = new Holder();
        CoinDispencer coin = new CoinDispencer();
        Display display = new Display();
        VendingMachine vendingMachine = new VendingMachine(hold, coin, display, products);

        for (Product prod : vendingMachine.getListProduct()) {
            System.out.println(prod);
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize(products);
    }
}