import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

/**
 * Класс App представляет точку входа в приложение.
 * Он инициализирует модель, представление и контроллер,
 * а также управляет выбором языка приложения и чтением данных о студентах из файла.
 */
public class App {
    /**
     * Метод main - точка входа в приложение.
     * Создает модель, представление и контроллер, и запускает приложение через контроллер.
     *
     * @param args Параметры командной строки (не используются).
     */
    public static void main(String[] args) {
        // Получаем выбор языка от пользователя
        String language = chooseLanguage();

        // Создаем список студентов из файла
        List<Student> studList = createStudentListFromFile("HW_5//java//MVCStudentApp//StudentDB.csv");

        // Создаем модель
        iGetModel model = new ModelClassHash(studList);

        // Создаем представление в зависимости от выбранного языка
        iGetView view = null;
        if (language.equalsIgnoreCase("1")) {
            view = new ViewClass(); // Русский язык
        } else {
            view = new ViewClassEng(); // Английский язык
        }

        // Создаем контроллер и передаем ему модель и представление
        ControllerClass controller = new ControllerClass(model, view);

        // Запускаем приложение через контроллер
        controller.run();
    }

    /**
     * Метод для запроса выбора языка у пользователя.
     *
     * @return Строка, представляющая выбранный пользователем язык.
     */
    private static String chooseLanguage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите язык:");
        System.out.println("1. Русский");
        System.out.println("2. English");
        System.out.print("> ");
        return scanner.nextLine();
    }

    /**
     * Метод для создания списка студентов из файла.
     *
     * @param filename Имя файла, содержащего данные о студентах.
     * @return Список студентов, загруженный из файла.
     */
    private static List<Student> createStudentListFromFile(String filename) {
        List<Student> studList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // предполагается, что данные разделены запятыми
                // Создаем объект Student из данных файла
                String name = data[0]; // имя
                int age = Integer.parseInt(data[1].trim()); // преобразуем возраст из строки в int
                int id = Integer.parseInt(data[2].trim()); // преобразуем id из строки в int
                Student student = new Student(name, age, id);
                studList.add(student);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Ошибка при чтении возраста студента или id: " + e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка при чтении файла: неправильный формат строки");
            e.printStackTrace();
        }
        return studList;
    }        
}



// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// import Controller.ControllerClass;
// import Controller.Interfaces.iGetModel;
// import Controller.Interfaces.iGetView;
// import Model.ModelClassHash;
// import Model.Domain.Student;
// import View.ViewClass;
// import View.ViewClassEng;

// public class App {
//     public static void main(String[] args) {
//         // Получаем выбор языка от пользователя
//         String language = chooseLanguage();

//         // Создаем список студентов из файла
//         List<Student> studList = createStudentListFromFile("HW_5//java//MVCStudentApp//StudentDB.csv");

//         // Создаем модель
//         iGetModel model = new ModelClassHash(studList);

//         // Создаем представление в зависимости от выбранного языка
//         iGetView view = null;
//         if (language.equalsIgnoreCase("1")) {
//             view = new ViewClass(); // Русский язык
//         } else {
//             view = new ViewClassEng(); // Английский язык
//         }

//         // Создаем контроллер и передаем ему модель и представление
//         ControllerClass controller = new ControllerClass(model, view);

//         // Запускаем приложение через контроллер
//         controller.run();
//     }

//     private static String chooseLanguage() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Выберите язык:");
//         System.out.println("1. Русский");
//         System.out.println("2. English");
//         System.out.print("> ");
//         return scanner.nextLine();
//     }

//     private static List<Student> createStudentListFromFile(String filename) {
//         List<Student> studList = new ArrayList<>();
//         try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 String[] data = line.split(","); // предполагается, что данные разделены запятыми
//                 // Создаем объект Student из данных файла
//                 String name = data[0]; // имя
//                 int age = Integer.parseInt(data[1].trim()); // преобразуем возраст из строки в int
//                 int id = Integer.parseInt(data[2].trim()); // преобразуем id из строки в int
//                 Student student = new Student(name, age, id);
//                 studList.add(student);
//             }
//         } catch (IOException e) {
//             System.err.println("Ошибка при чтении файла: " + e.getMessage());
//             e.printStackTrace();
//         } catch (NumberFormatException e) {
//             System.err.println("Ошибка при чтении возраста студента или id: " + e.getMessage());
//             e.printStackTrace();
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.err.println("Ошибка при чтении файла: неправильный формат строки");
//             e.printStackTrace();
//         }
//         return studList;
//     }        
// }



// import Controller.ControllerClass;
// import Controller.Interfaces.iGetModel;
// import Controller.Interfaces.iGetView;
// import Model.ModelClassHash;
// import Model.Domain.Student;
// import View.ViewClass;
// import View.ViewClassEng;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         // Получаем выбор языка от пользователя
//         String language = chooseLanguage();

//         // Создаем список студентов
//         List<Student> studList = createStudentList();

//         // Создаем модель
//         iGetModel model = new ModelClassHash(studList);

//         // Создаем представление в зависимости от выбранного языка
//         iGetView view = null;
//         if (language.equalsIgnoreCase("1")) {
//             view = new ViewClass(); // Русский язык
//         } else {
//             view = new ViewClassEng(); // Английский язык
//         }

//         // Создаем контроллер и передаем ему модель и представление
//         ControllerClass controller = new ControllerClass(model, view);

//         // Запускаем приложение через контроллер
//         controller.run();
//     }

//     private static String chooseLanguage() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Выберите язык:");
//         System.out.println("1. Русский");
//         System.out.println("2. English");
//         System.out.print("> ");
//         return scanner.nextLine();
//     }

//     private static List<Student> createStudentList() {
//         List<Student> studList = new ArrayList<>();
//         // Здесь добавьте создание студентов
//         studList.add(new Student("Ivan", 21));
//         studList.add(new Student("Anna", 25));
//         studList.add(new Student("Vasya", 22));
//         studList.add(new Student("Nastya", 27));
//         studList.add(new Student("Vasilisa", 26));
//         studList.add(new Student("Karina", 25));
//         studList.add(new Student("Andrey", 22));
//         studList.add(new Student("Masha", 27));
//         studList.add(new Student("Irina", 28));
//         studList.add(new Student("Nikolay", 30));
//         return studList;
//     }
// }



// import Controller.ControllerClass;
// import Controller.Interfaces.iGetModel;
// import Controller.Interfaces.iGetView;
// import Model.ModelClassHash;
// import Model.Domain.Student;
// import View.ViewClass;

// import java.util.ArrayList;
// import java.util.List;

// public class App {
//     public static void main(String[] args) {
//         List<Student> studList = new ArrayList<>();
//         studList.add(new Student("Ivan", 21));
//         studList.add(new Student("Anna", 25));
//         studList.add(new Student("Vasya", 22));
//         studList.add(new Student("Nastya", 27));
//         studList.add(new Student("Vasilisa", 26));
//         studList.add(new Student("Karina", 25));
//         studList.add(new Student("Andrey", 22));
//         studList.add(new Student("Masha", 27));
//         studList.add(new Student("Irina", 28));
//         studList.add(new Student("Nikolay", 30));

//         // Инициализируем модель с использованием новой реализации ModelClassHash
//         iGetModel model = new ModelClassHash(studList);

//         // Инициализируем представление
//         iGetView view = new ViewClass();

//         // Создаем контроллер и передаем ему модель и представление
//         ControllerClass controller = new ControllerClass(model, view);

//         // Запускаем приложение через контроллер
//         controller.run();
//     }
// }



// import java.util.ArrayList;
// import java.util.List;

// import javax.swing.text.View;

// import Controller.ControllerClass;
// import Controller.Interfaces.iGetModel;
// import Controller.Interfaces.iGetView;
// import Model.FileModelClass;
// import Model.ModelClass;
// import Model.Domain.Student;
// import View.ViewClass;

// public class App {
//     public static void main(String[] args) throws Exception {      

//         Student student1 = new Student("Ivan", 21);
//         Student student2 = new Student("Anna", 25);
//         Student student3 = new Student("Vasya", 22);
//         Student student4 = new Student("Nastya", 27);
//         Student student5 = new Student("Vasilisa", 26);
//         Student student6 = new Student("Karina", 25);
//         Student student7 = new Student("Andrey", 22);
//         Student student8 = new Student("Masha", 27);
//         Student student9 = new Student("Irina", 28);
//         Student student10 = new Student("Nikolay", 30);

//         List<Student> studList = new ArrayList<>();
//         studList.add(student1);
//         studList.add(student2);
//         studList.add(student3);
//         studList.add(student4);
//         studList.add(student5);
//         studList.add(student6);
//         studList.add(student7);
//         studList.add(student8);
//         studList.add(student9);
//         studList.add(student10);

//         FileModelClass fmodel = new FileModelClass("StudentDB.csv");
//         //fmodel.saveAllStudentToFile(studList);

//         iGetModel model = new ModelClass(studList);
//         iGetView view = new ViewClass();

//         ControllerClass controller = new ControllerClass(fmodel, view);

//         controller.run();
//     }
// }
