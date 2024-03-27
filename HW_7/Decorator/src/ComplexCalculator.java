public class ComplexCalculator implements Calculator {
    // Поле для хранения результата операций калькулятора
    private ComplexNumber result;

    // Конструктор класса, инициализирующий результат нулевым комплексным числом
    public ComplexCalculator() {
        this.result = new ComplexNumber(0, 0);
    }

    // Метод для выполнения операции сложения
    @Override
    public ComplexNumber add(ComplexNumber num) {
        // Обновление результата операции сложения и его сохранение
        result = result.add(num);
        return result;
    }

    // Метод для выполнения операции умножения
    @Override
    public ComplexNumber multiply(ComplexNumber num) {
        // Обновление результата операции умножения и его сохранение
        result = result.multiply(num);
        return result;
    }

    // Метод для выполнения операции деления
    @Override
    public ComplexNumber divide(ComplexNumber num) {
        // Обновление результата операции деления и его сохранение
        result = result.divide(num);
        return result;
    }

    // Метод для получения текущего результата операции
    @Override
    public ComplexNumber getResult() {
        return result;
    }
}
