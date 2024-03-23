package Classes;

import AbstractClass.Shape;

// Класс для квадрата
public class Square extends Shape {
    private int side;

    @Override
    public void setWidth(int width) {
        this.side = width;
    }

    @Override
    public void setHeight(int height) {
        this.side = height;
    }

    @Override
    public int area() {
        return this.side * this.side;
    }
}
