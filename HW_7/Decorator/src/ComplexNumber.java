public class ComplexNumber {
    // Поля для хранения действительной и мнимой частей комплексного числа
    private double real;
    private double imaginary;

    // Конструктор класса для инициализации действительной и мнимой частей комплексного числа
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Метод для получения действительной части комплексного числа
    public double getReal() {
        return real;
    }

    // Метод для получения мнимой части комплексного числа
    public double getImaginary() {
        return imaginary;
    }

    // Метод для выполнения операции сложения комплексных чисел
    public ComplexNumber add(ComplexNumber other) {
        // Создание нового комплексного числа с суммой действительных и мнимых частей
        return new ComplexNumber(this.real + other.getReal(), this.imaginary + other.getImaginary());
    }

    // Метод для выполнения операции умножения комплексных чисел
    public ComplexNumber multiply(ComplexNumber other) {
        // Вычисление новой действительной и мнимой частей по формуле для умножения комплексных чисел
        double newReal = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double newImaginary = this.real * other.getImaginary() + this.imaginary * other.getReal();
        // Создание нового комплексного числа с результатом умножения
        return new ComplexNumber(newReal, newImaginary);
    }

    // Метод для выполнения операции деления комплексных чисел
    public ComplexNumber divide(ComplexNumber other) {
        // Вычисление делителя по формуле для деления комплексных чисел
        double divisor = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        // Вычисление новой действительной и мнимой частей по формуле для деления комплексных чисел
        double newReal = (this.real * other.getReal() + this.imaginary * other.getImaginary()) / divisor;
        double newImaginary = (this.imaginary * other.getReal() - this.real * other.getImaginary()) / divisor;
        // Создание нового комплексного числа с результатом деления
        return new ComplexNumber(newReal, newImaginary);
    }

    // Переопределение метода toString для получения строкового представления комплексного числа
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
