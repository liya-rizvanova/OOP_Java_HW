package Classes;

import Interfaces.Shape;

// Квадрат теперь отдельный класс, а не наследник Rectangle
public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}
