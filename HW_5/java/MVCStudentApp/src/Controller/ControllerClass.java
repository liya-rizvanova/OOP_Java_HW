/*
 * Класс ControllerClass отвечает за управление взаимодействием между моделью и представлением.
 */
package Controller;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.FileModelClass;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;

    /**
     * Конструктор класса ControllerClass.
     *
     * @param model Объект, реализующий интерфейс iGetModel, представляющий модель данных.
     * @param view  Объект, реализующий интерфейс iGetView, представляющий представление данных.
     */
    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Запускает контроллер, начинает выполнение основного цикла приложения.
     */
    public void run() {
        // Добавляем хук завершения работы программы для сохранения данных, если используется файловая модель
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                if (model instanceof FileModelClass) {
                    ((FileModelClass) model).saveAllStudentsToFile();
                }
            }
        });

        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            // Получаем команду от пользователя
            String command = view.prompt("Enter command: (1. Список/List, 2. Удалить/Delete, 3. Выход/Exit)");
            int commandNumber = Integer.parseInt(command);

            // Преобразуем введенное значение в команду
            switch (commandNumber) {
                case 1:
                    com = Command.LIST;
                    break;
                case 2:
                    com = Command.DELETE;
                    break;
                case 3:
                    com = Command.EXIT;
                    break;
                default:
                    com = Command.NONE;
                    break;
            }

            // Обрабатываем команду
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exiting program!");
                    break;
                case LIST:
                    // Выводим список всех студентов
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    // Выводим список всех студентов и запрашиваем удаление студента
                    view.printAllStudents(model.getAllStudents());
                    deleteStudent();
                    break;
            }
        }
    }

    /**
     * Удаляет студента из модели данных по его ID.
     */
    private void deleteStudent() {
        int idToDelete = Integer.parseInt(view.prompt("Enter student ID to delete:"));
        boolean deleted = model.deleteStudent(idToDelete);
        if (deleted) {
            System.out.println("Student with ID " + idToDelete + " has been deleted.");
        } else {
            System.out.println("No student found with ID " + idToDelete + ".");
        }
    }
}


// package Controller;

// import Controller.Interfaces.iGetModel;
// import Controller.Interfaces.iGetView;
// import Model.FileModelClass;

// public class ControllerClass {

//     private iGetModel model;
//     private iGetView view;

//     public ControllerClass(iGetModel model, iGetView view) {
//         this.model = model;
//         this.view = view;
//     }

//     public void run() {
//         Runtime.getRuntime().addShutdownHook(new Thread() {
//             public void run() {
//                 if (model instanceof FileModelClass) {
//                     ((FileModelClass) model).saveAllStudentsToFile();
//                 }
//             }
//         });
//         Command com = Command.NONE;
//         boolean getNewIteration = true;
//         while (getNewIteration) {
//             String command = view.prompt("Enter command: (1. Список/List, 2. Удалить/Delete, 3. Выход/Exit)");
//             int commandNumber = Integer.parseInt(command);
//             switch (commandNumber) {
//                 case 1:
//                     com = Command.LIST;
//                     break;
//                 case 2:
//                     com = Command.DELETE;
//                     break;
//                 case 3:
//                     com = Command.EXIT;
//                     break;
//                 default:
//                     com = Command.NONE;
//                     break;
//             }
//             switch (com) {
//                 case EXIT:
//                     getNewIteration = false;
//                     System.out.println("Exiting program!");
//                     break;
//                 case LIST:
//                     view.printAllStudents(model.getAllStudents());
//                     break;
//                 case DELETE:
//                     view.printAllStudents(model.getAllStudents());
//                     deleteStudent();                    
//                     break;
//             }
//         }
//     }

//     private void deleteStudent() {
//         int idToDelete = Integer.parseInt(view.prompt("Enter student ID to delete:"));
//         boolean deleted = model.deleteStudent(idToDelete);
//         if (deleted) {
//             System.out.println("Student with ID " + idToDelete + " has been deleted.");
//         } else {
//             System.out.println("No student found with ID " + idToDelete + ".");
//         }
//     }
// }




// package Controller;

// import Controller.Interfaces.iGetModel;
// import Controller.Interfaces.iGetView;
// import Model.Domain.Student;
// import java.util.List;

// public class ControllerClass {

//     private iGetModel model;
//     private iGetView view;

//     public ControllerClass(iGetModel model, iGetView view) {
//         this.model = model;
//         this.view = view;
//     }

//     public void run() {
//         Command com = Command.NONE;
//         boolean getNewIteration = true;
//         while (getNewIteration) {
//             String command = view.prompt("Enter command: (1. Список/List, 2. Удалить/Delete, 3. Выход/Exit)");
//             int commandNumber = Integer.parseInt(command);
//             switch (commandNumber) {
//                 case 1:
//                     com = Command.LIST;
//                     break;
//                 case 2:
//                     com = Command.DELETE;
//                     break;
//                 case 3:
//                     com = Command.EXIT;
//                     break;
//                 default:
//                     com = Command.NONE;
//                     break;
//             }
//             switch (com) {
//                 case EXIT:
//                     getNewIteration = false;
//                     System.out.println("Exiting program!");
//                     break;
//                 case LIST:
//                     view.printAllStudents(model.getAllStudents());
//                     break;
//                 case DELETE:
//                     view.printAllStudents(model.getAllStudents());
//                     deleteStudent();                    
//                     break;
//             }
//         }
//     }

//     private void deleteStudent() {
//         int idToDelete = Integer.parseInt(view.prompt("Enter student ID to delete:"));
//         boolean deleted = model.deleteStudent(idToDelete);
//         if (deleted) {
//             System.out.println("Student with ID " + idToDelete + " has been deleted.");
//         } else {
//             System.out.println("No student found with ID " + idToDelete + ".");
//         }
//     }
// }




// package Controller;

// import Controller.Interfaces.iGetModel;
// import Controller.Interfaces.iGetView;
// import Model.ModelClassHash;
// import Model.Domain.Student;
// import java.util.List;

// public class ControllerClass {

//     private iGetModel model;
//     private iGetView view;

//     public ControllerClass(iGetModel model, iGetView view) {
//         this.model = model;
//         this.view = view;
//     }

//     public void run() {
//         Command com = Command.NONE;
//         boolean getNewIteration = true;
//         while (getNewIteration) {
//             String command = view.prompt("Enter command: (NONE, READ, CREATE, UPDATE, LIST, DELETE, EXIT)");
//             com = Command.valueOf(command.toUpperCase());
//             switch (com) {
//                 case EXIT:
//                     getNewIteration = false;
//                     System.out.println("Exiting program!");
//                     break;
//                 case LIST:
//                     view.printAllStudents(model.getAllStudents());
//                     break;
//             }
//         }
//     }
// }



// package Controller;

// import java.util.ArrayList;
// import java.util.List;

// import Controller.Interfaces.iGetModel;
// import Controller.Interfaces.iGetView;
// import Model.ModelClass;
// import Model.Domain.Student;
// import View.ViewClass;
// import View.ViewClassEng; // Импортируем класс ViewClassEng

// public class ControllerClass {

//     private iGetModel model;
//     private iGetView view;
//     private List<Student> buffer = new ArrayList<>();

//     public ControllerClass(iGetModel model, iGetView view) {
//         this.model = model;
//         this.view = view;
//     }

//     private boolean testData(List<Student> students) {
//         if(students.size()>0)
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }

//     public void update() {
//         //MVC
//         //view.printAllStudents(model.getAllStudents());

//         //MVP
//         buffer = model.getAllStudents();

//         if(testData(buffer))
//         {
//             view.printAllStudents(buffer);
//         }
//         else{
//             System.out.println("Список студентов пуст!");
//         }
//     }

//     public void displayStudents(List<Student> students) {
//         // Используем методы представления из ViewClassEng
//         ((ViewClassEng) view).printAllStudents(students);
//     }

//     public void run() {
//         Command com = Command.NONE;
//         boolean getNewIteration = true;
//         while (getNewIteration) {
//             String command = view.prompt("Введите команду: (NONE, READ, CREATE, UPDATE, LIST, DELETE, EXIT");
//             com = Command.valueOf(command.toUpperCase());
//             switch (com) {
//                 case EXIT:
//                     getNewIteration = false;
//                     System.out.println("Выход из программы!");
//                     break;
//                 case LIST:
//                     //MVC
//                     view.printAllStudents(model.getAllStudents());
//                     break;
//             }
//         }
//     }    
// }
