public class App {
    public static void main(String[] args) throws Exception {
        // Создание экземпляра базового калькулятора ComplexCalculator
        ComplexCalculator calculator = new ComplexCalculator();
        
        // Создание декоратора для калькулятора с использованием логгера LoggerImpl
        Decorator decoratedCalculator = new Decorator(calculator, new LoggerImpl());
        
        // Создание представления калькулятора для взаимодействия с пользователем
        ViewComplexCalculator view = new ViewComplexCalculator(decoratedCalculator);
        
        // Запуск представления калькулятора
        view.run();
    }
}
