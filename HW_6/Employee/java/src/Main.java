import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Employee
        Employee employee = new Employee("Иван", new Date(0), 50000);

        // Создаем объект SalaryCalculator
        SalaryCalculator calculator = new SalaryCalculator();

        // Вычисляем и выводим налоги и чистую зарплату
        int netSalary = calculator.calculateNetSalary(employee);
        System.out.println("Чистая зарплата: " + netSalary);
    }
}
