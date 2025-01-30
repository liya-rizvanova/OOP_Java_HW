Этот код нарушает Принцип подстановки Барбары Лисков (LSP) из SOLID.

// Прямоугольник
public class Rectangle {

    int height;
    int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
// Квадрат
public class Square extends Rectangle {

    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
}