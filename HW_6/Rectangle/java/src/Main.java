import AbstractClass.Shape;
import Classes.Rectangle;
import Classes.Square;

public class Main {
    public static void main(String[] args) {
        // Создаем прямоугольник
        Shape rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Площадь прямоугольника: " + rectangle.area());

        // Создаем квадрат
        Shape square = new Square();
        square.setWidth(7);
        square.setHeight(7);
        System.out.println("Площадь квадрата: " + square.area());
    }
}
