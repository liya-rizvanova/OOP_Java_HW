package Classes;

import Interfaces.Shape;

// Прямоугольник, реализующий интерфейс Shape
public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return height * width;
    }
}
