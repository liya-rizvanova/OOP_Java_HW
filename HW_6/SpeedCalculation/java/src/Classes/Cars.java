package Classes;
// Класс для представления автомобиля, наследуется от класса Vehicle

public class Cars extends Vehicle {
    // Конструктор, вызывает конструктор родительского класса
    public Cars(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    // Метод для вычисления разрешенной скорости для автомобиля
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8; // 80% от максимальной скорости для автомобиля
    }
}
