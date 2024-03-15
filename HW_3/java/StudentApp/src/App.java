import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;

public class App {
    public static void main(String[] args) {
        // Создаем несколько студентов
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);
        Student s7 = new Student("Петр", 24);
        Student s8 = new Student("Мария", 22);
        Student s9 = new Student("Анна", 23);
        Student s10 = new Student("Николай", 24);
        Student s11 = new Student("Ольга", 22);
        Student s12 = new Student("Евгений", 23);

        // Создаем группы студентов
        List<Student> listStud1 = new ArrayList<>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        StudentGroup group5830 = new StudentGroup(listStud1, 5830);

        List<Student> listStud2 = new ArrayList<>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        StudentGroup group5831 = new StudentGroup(listStud2, 5831);

        List<Student> listStud3 = new ArrayList<>();
        listStud3.add(s10);
        listStud3.add(s11);
        listStud3.add(s12);
        StudentGroup group5832 = new StudentGroup(listStud3, 5832);

        // Создаем два потока студентов и добавляем группы
        StudentStream stream1 = new StudentStream(1);
        stream1.addGroup(group5830);
        stream1.addGroup(group5831);

        StudentStream stream2 = new StudentStream(2);
        stream2.addGroup(group5832);

        // Сортируем группы в каждом потоке
        sortGroupsInStream(stream1);
        sortGroupsInStream(stream2);

        // Выводим информацию о каждом потоке студентов
        System.out.println("Первый поток:");
        for (StudentGroup group : stream1) {
            System.out.println("Group ID: " + group.getIdGroup());
            for (Student student : group) {
                System.out.println(student);
            }
        }

        System.out.println("\nВторой поток:");
        for (StudentGroup group : stream2) {
            System.out.println("Group ID: " + group.getIdGroup());
            for (Student student : group) {
                System.out.println(student);
            }
        }
    }
    
    // Метод для сортировки групп в потоке
    private static void sortGroupsInStream(StudentStream stream) {
        Collections.sort(stream.getGroups());
    }
}
