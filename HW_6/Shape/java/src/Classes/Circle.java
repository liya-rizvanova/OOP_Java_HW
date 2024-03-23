package Classes;
// Класс для представления круга, реализует интерфейс TwoDimensionalShape

import Interfaces.TwoDimensionalShape;

public class Circle implements TwoDimensionalShape {
    private double radius;

    // Конструктор для инициализации радиуса круга
    public Circle(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления площади круга
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
