/*
 * Пакет View содержит классы, относящиеся к пользовательскому интерфейсу и отображению данных.
 */
package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView {

    /**
     * Выводит список всех студентов на консоль.
     *
     * @param students Список студентов для вывода.
     */
    public void printAllStudents(List<Student> students)
    {
        System.out.println("------------------- Список студентов ---------------------------");

        for(Student s : students)
        {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------------------------------");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }    
}


// package View;

// import java.util.List;
// import java.util.Scanner;

// import Controller.Interfaces.iGetView;
// import Model.Domain.Student;

// public class ViewClass implements iGetView {

//     public void printAllStudents(List<Student> students)
//     {
//         System.out.println("------------------- Список студентов ---------------------------");

//         for(Student s : students)
//         {
//             System.out.println(s);
//         }

//         System.out.println("-----------------------------------------------------------------");
//     }

//     @Override
//     public String prompt(String msg) {
//         Scanner in = new Scanner(System.in);
//         System.out.println(msg);
//         return in.nextLine();
//     }    
// }
