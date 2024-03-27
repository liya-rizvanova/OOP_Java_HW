import java.util.Scanner;

public class ViewComplexCalculator {
    @SuppressWarnings("unused")
    private Calculator calculator;

    // Конструктор класса, принимающий экземпляр калькулятора
    public ViewComplexCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    // Метод для запуска представления калькулятора
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Ожидание ввода операции от пользователя
            System.out.println("Enter operation (a: add, m: multiply, d: divide, q: quit): ");
            String operation = scanner.nextLine().trim();
            
            // Обработка введенной операции
            switch (operation) {
                case "q": // Если пользователь ввел "q", завершаем работу калькулятора
                    return;
                case "a": // Если пользователь выбрал операцию сложения, выполняем ее
                    performAddition(scanner);
                    break;
                case "m": // Если пользователь выбрал операцию умножения, выполняем ее
                    performMultiplication(scanner);
                    break;
                case "d": // Если пользователь выбрал операцию деления, выполняем ее
                    performDivision(scanner);
                    break;
                default: // Если пользователь ввел некорректную операцию, выводим сообщение об ошибке
                    System.out.println("Invalid operation!");
            }
        }
    }

    // Метод для выполнения операции сложения комплексных чисел
    private void performAddition(Scanner scanner) {
        // Получаем действительную и мнимую части обоих комплексных чисел от пользователя
        System.out.println("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
    
        System.out.println("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);
    
        // Выполняем операцию сложения
        ComplexNumber result = num1.add(num2);
    
        // Выводим только итоговый результат
        System.out.println("Result after addition: " + result);    
        scanner.nextLine(); // Считываем лишний перевод строки
    }      

    // Метод для выполнения операции умножения комплексных чисел
    private void performMultiplication(Scanner scanner) {
        // Получаем действительную и мнимую части обоих комплексных чисел от пользователя
        System.out.println("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
    
        System.out.println("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);
    
        // Выполняем операцию умножения, учитывая оба комплексных числа
        ComplexNumber result = num1.multiply(num2);
    
        // Отображаем результат умножения
        System.out.println("Result after multiplication: " + result);
        scanner.nextLine(); // Consume newline
    }

    // Метод для выполнения операции деления комплексных чисел
    private void performDivision(Scanner scanner) {
        // Получаем действительную и мнимую части обоих комплексных чисел от пользователя
        System.out.println("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
    
        System.out.println("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);
    
        // Выполняем операцию деления, учитывая оба комплексных числа
        ComplexNumber result = num1.divide(num2);
    
        // Отображаем результат деления
        System.out.println("Result after division: " + result);
        scanner.nextLine(); // Consume newline
    }
}
