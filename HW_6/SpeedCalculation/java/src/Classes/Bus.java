package Classes;
// Класс для представления автобуса, наследуется от класса Vehicle

public class Bus extends Vehicle {
    // Конструктор, вызывает конструктор родительского класса
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    // Метод для вычисления разрешенной скорости для автобуса
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6; // 60% от максимальной скорости для автобуса
    }
}
