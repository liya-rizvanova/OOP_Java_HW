import Classes.Car;
import Classes.DieselEngine;
import Interfaces.Engine;
import Interfaces.PetrolEngine;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты двигателей
        Engine petrolEngine = new PetrolEngine();
        DieselEngine dieselEngine = new DieselEngine();

        // Создаем автомобили с различными типами двигателей
        Car petrolCar = new Car(petrolEngine);
        Car dieselCar = new Car(dieselEngine);

        // Запускаем двигатели автомобилей
        petrolCar.start();
        dieselCar.start();
    }
}
