package Classes;

import Interfaces.GreetingStrategy;

public class CasualGreeting implements GreetingStrategy {
    public String greet() {
        return "Sup bro?";
    }
}
