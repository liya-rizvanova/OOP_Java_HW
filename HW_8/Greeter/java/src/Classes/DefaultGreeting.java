package Classes;

import Interfaces.GreetingStrategy;

public class DefaultGreeting implements GreetingStrategy {
    public String greet() {
        return "Hello.";
    }
}
