package Classes;

public class Vehicle {
    int maxSpeed;
    String type;

    // Конструктор для инициализации максимальной скорости и типа транспортного средства
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    // Метод для получения максимальной скорости
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    // Метод для получения типа транспортного средства
    public String getType() {
        return this.type;
    }
}
