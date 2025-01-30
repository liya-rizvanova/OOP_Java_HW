import Classes.CasualGreeting;
import Classes.DefaultGreeting;
import Classes.FormalGreeting;
import Classes.Greeter;
import Classes.IntimateGreeting;

public class Main {
    public static void main(String[] args) {
        // Демонстрация работы паттерна: можно менять стратегии без изменения кода класса Greeter
        Greeter greeter = new Greeter(new DefaultGreeting());
        System.out.println(greeter.greet());

        greeter.setGreetingStrategy(new FormalGreeting());
        System.out.println(greeter.greet());

        greeter.setGreetingStrategy(new CasualGreeting());
        System.out.println(greeter.greet());

        greeter.setGreetingStrategy(new IntimateGreeting());
        System.out.println(greeter.greet());
    }
}
