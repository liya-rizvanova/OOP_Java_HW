// Класс для расчета заработной платы сотрудника
public class SalaryCalculator {
    // Метод для расчета чистой заработной платы на основе базовой заработной платы и налога
    public int calculateNetSalary(Employee employee) {
        int baseSalary = employee.getBaseSalary(); // Получаем базовую заработную плату сотрудника
        int tax = (int) (baseSalary * 0.25); // Рассчитываем налог как 25% от базовой заработной платы (может быть изменено)
        return baseSalary - tax; // Возвращаем чистую заработную плату, вычитая налог
    }
}