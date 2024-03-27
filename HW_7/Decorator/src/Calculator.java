public interface Calculator {
    // Метод для выполнения операции сложения комплексных чисел
    ComplexNumber add(ComplexNumber num);
    
    // Метод для выполнения операции умножения комплексных чисел
    ComplexNumber multiply(ComplexNumber num);
    
    // Метод для выполнения операции деления комплексных чисел
    ComplexNumber divide(ComplexNumber num);
    
    // Метод для получения результата операции
    ComplexNumber getResult();
}
