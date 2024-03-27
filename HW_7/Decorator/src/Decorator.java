public class Decorator implements Calculator {
    // Поле для хранения ссылки на декорируемый калькулятор
    private Calculator calculator;
    // Поле для хранения ссылки на логгер
    private LoggerImpl logger;

    // Конструктор класса, принимающий ссылку на калькулятор и логгер
    public Decorator(Calculator calculator, LoggerImpl loggerImpl) {
        this.calculator = calculator;
        this.logger = loggerImpl;
    }

    // Метод для выполнения операции сложения комплексных чисел
    @Override
    public ComplexNumber add(ComplexNumber num) {
        // Запись сообщения о выполняемой операции в лог
        logger.log("Adding complex number: " + num);
        // Вызов метода сложения у декорируемого калькулятора и получение результата
        ComplexNumber result = calculator.add(num);
        // Запись сообщения о результате операции в лог
        logger.log("Result after addition: " + result);
        // Возврат результата операции
        return result;
    }

    // Метод для выполнения операции умножения комплексных чисел
    @Override
    public ComplexNumber multiply(ComplexNumber num) {
        // Запись сообщения о выполняемой операции в лог
        logger.log("Multiplying complex number: " + num);
        // Вызов метода умножения у декорируемого калькулятора и получение результата
        ComplexNumber result = calculator.multiply(num);
        // Запись сообщения о результате операции в лог
        logger.log("Result after multiplication: " + result);
        // Возврат результата операции
        return result;
    }

    // Метод для выполнения операции деления комплексных чисел
    @Override
    public ComplexNumber divide(ComplexNumber num) {
        // Запись сообщения о выполняемой операции в лог
        logger.log("Dividing by complex number: " + num);
        // Вызов метода деления у декорируемого калькулятора и получение результата
        ComplexNumber result = calculator.divide(num);
        // Запись сообщения о результате операции в лог
        logger.log("Result after division: " + result);
        // Возврат результата операции
        return result;
    }

    // Метод для получения текущего результата операции
    @Override
    public ComplexNumber getResult() {
        // Получение текущего результата операции у декорируемого калькулятора
        return calculator.getResult();
    }
}
