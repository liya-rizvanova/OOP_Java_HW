import Classes.Circle;
import Classes.Cube;
import Interfaces.ThreeDimensionalShape;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты для тестирования
        Circle circle = new Circle(5); // Создаем круг с радиусом 5
        Cube cube = new Cube(3);       // Создаем куб со стороной 3

        // Выводим площадь круга и поверхность куба
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Площадь поверхности куба: " + cube.area());

        // Приведение объекта куба к интерфейсу ThreeDimensionalShape для вывода объема
        ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) cube;
        System.out.println("Объем куба: " + threeDShape.volume());
    }
}
