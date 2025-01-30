package Classes;

import Interfaces.GreetingStrategy;

// Класс Greeter теперь следует OCP, так как не изменяется при добавлении новых типов приветствий
public class Greeter {
    private GreetingStrategy greetingStrategy;

    public Greeter(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public void setGreetingStrategy(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public String greet() {
        return greetingStrategy.greet();
    }
}
