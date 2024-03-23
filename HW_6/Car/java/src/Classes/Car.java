/*Переписать код в соответствии с Dependency Inversion Principle:
public class Car {
private PetrolEngine engine;
public Car(PetrolEngine engine) {
this.engine = engine;
}
public void start() {
this.engine.start();
}
}
public class PetrolEngine {
public void start() {
}
}
Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine. */
// Класс машины
package Classes;

import Interfaces.Engine;

public class Car {
    private Engine engine;

    // Конструктор принимает интерфейс Engine, что позволяет использовать различные типы двигателей
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Метод для запуска двигателя
    public void start() {
        this.engine.start();
    }
}
