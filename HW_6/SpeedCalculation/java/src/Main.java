import Classes.Bus;
import Classes.Cars;
import Classes.SpeedCalculation;
import Classes.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты для тестирования
        Vehicle car = new Cars(100); // Создаем автомобиль с максимальной скоростью 100
        Vehicle bus = new Bus(80);  // Создаем автобус с максимальной скоростью 80

        // Создаем экземпляр SpeedCalculation
        SpeedCalculation speedCalculation = new SpeedCalculation();

        // Вычисляем и выводим разрешенную скорость для автомобиля и автобуса
        double allowedSpeedForCar = speedCalculation.calculateAllowedSpeed(car);
        double allowedSpeedForBus = speedCalculation.calculateAllowedSpeed(bus);

        System.out.println("Разрешенная скорость для автомобиля: " + allowedSpeedForCar);
        System.out.println("Разрешенная скорость для автобуса: " + allowedSpeedForBus);
    }
}
