/*
 * Этот интерфейс определяет методы для взаимодействия с представлением (View).
 */
package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetView {

    /**
     * Выводит список всех студентов на представлении.
     *
     * @param students Список объектов Student, которые нужно вывести.
     */
    public void printAllStudents(List<Student> students);

    /**
     * Запрашивает ввод от пользователя с указанным сообщением.
     *
     * @param msg Сообщение, которое нужно вывести перед запросом ввода.
     * @return Строка, введенная пользователем.
     */
    public String prompt(String msg);
}


// package Controller.Interfaces;

// import java.util.List;

// import Model.Domain.Student;

// public interface iGetView {
//      public void printAllStudents(List<Student> students);
//      public String prompt(String msg);
// }
