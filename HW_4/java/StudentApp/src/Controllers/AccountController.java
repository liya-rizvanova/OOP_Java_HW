package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Teacher;

public class AccountController {

    public static <V extends Person> void print(List<V> group) {
        for (V s : group) {
            System.out.println(s);
        }
    }

    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    public static <T extends Person> double averageAge(List<T> persons) {
        if (persons.isEmpty()) {
            return 0.0;
        }
        double totalAge = 0;
        for (T person : persons) {
            totalAge += person.getAge();
        }
        return totalAge / persons.size();
    }
}
