package Classes;

// Класс для дизельного двигателя

import Interfaces.Engine;

public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }
}
