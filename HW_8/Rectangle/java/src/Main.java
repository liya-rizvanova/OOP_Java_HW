import Classes.Rectangle;
import Classes.Square;
import Interfaces.Shape;

// Класс Main для тестирования фигур
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Shape square = new Square(7);
        System.out.println("Square Area: " + square.getArea());
    }
}
