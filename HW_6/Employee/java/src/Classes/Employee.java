/*Переписать код в соответствии с Single Responsibility Principle:
public class Employee {
private String name;
private Date dob;
private int baseSalary;
public Employee(String name, Date dob, int baseSalary) {
this.name = name;
this.dob = dob;
this.baseSalary = baseSalary;
}
public String getEmpInfo() {
return "name - " + name + " , dob - " + dob.toString();
}
public int calculateNetSalary() {
int tax = (int) (baseSalary * 0.25);//calculate in otherway
return baseSalary - tax;
}
}
•
Подсказка: вынесите метод calculateNetSalary() в отдельный класс */

import java.util.Date;

public class Employee {
    private String name; // Имя сотрудника
    private Date dob; // Дата его рождения
    private int baseSalary; // Базовая заработная плата

    // Конструктор класса Employee, инициализирующий поля name, dob и baseSalary
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    // Метод для получения информации о сотруднике
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    // Геттеры для получения значений полей класса Employee

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
