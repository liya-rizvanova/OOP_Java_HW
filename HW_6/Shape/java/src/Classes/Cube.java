package Classes;
// Класс для представления куба, реализует интерфейсы TwoDimensionalShape и ThreeDimensionalShape

import Interfaces.ThreeDimensionalShape;
import Interfaces.TwoDimensionalShape;

public class Cube implements TwoDimensionalShape, ThreeDimensionalShape {
    private int edge;

    // Конструктор для инициализации длины ребра куба
    public Cube(int edge) {
        this.edge = edge;
    }

    // Метод для вычисления площади поверхности куба
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    // Метод для вычисления объема куба
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
