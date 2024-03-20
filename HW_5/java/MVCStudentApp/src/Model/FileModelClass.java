/*
 * Пакет Model содержит классы, относящиеся к бизнес-логике и управлению данными.
 */
package Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class FileModelClass implements iGetModel {

    private String fileName;
    private List<Student> students;

    /**
     * Конструктор класса FileModelClass.
     */
    public FileModelClass() {
        this.fileName = "HW_5//java//MVCStudentApp//StudentDB.csv"; // Указываем имя файла
        createFileIfNotExists();
        loadDataFromFile();
    }

    /**
     * Создает файл, если он не существует.
     */
    private void createFileIfNotExists() {
        try {
            Path path = Path.of(fileName);
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    /**
     * Загружает данные о студентах из файла.
     */
    private void loadDataFromFile() {
        students = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));
            for (String line : lines) {
                String[] params = line.split(" ");
                students.add(new Student(params[0], Integer.parseInt(params[1]), 0));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public boolean deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                // Уменьшаем generalId при удалении студента
                Student.generalId--;
                saveAllStudentsToFile(); // Сохраняем изменения в файле после удаления
                return true;
            }
        }
        return false; // Если студент с указанным id не был найден
    }
    
    /**
     * Сохраняет данные о всех студентах в файл.
     */
    public void saveAllStudentsToFile() {
        try {
            List<String> lines = new ArrayList<>();
            for (Student student : students) {
                lines.add(student.getName() + " " + student.getAge());
            }
            Files.write(Path.of(fileName), lines);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}


// package Model;

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// import Controller.Interfaces.iGetModel;
// import Model.Domain.Student;

// public class FileModelClass implements iGetModel {

//     private String fileName;
//     private List<Student> students;

//     public FileModelClass() {
//         this.fileName = "HW_5//java//MVCStudentApp//StudentDB.csv"; // Указываем имя файла
//         createFileIfNotExists();
//         loadDataFromFile();
//     }

//     private void createFileIfNotExists() {
//         try {
//             Path path = Path.of(fileName);
//             if (!Files.exists(path)) {
//                 Files.createFile(path);
//             }
//         } catch (IOException e) {
//             System.out.println("Error creating file: " + e.getMessage());
//         }
//     }

//     private void loadDataFromFile() {
//         students = new ArrayList<>();
//         try {
//             List<String> lines = Files.readAllLines(Path.of(fileName));
//             for (String line : lines) {
//                 String[] params = line.split(" ");
//                 students.add(new Student(params[0], Integer.parseInt(params[1]), 0));
//             }
//         } catch (IOException e) {
//             System.out.println("Error reading file: " + e.getMessage());
//         }
//     }

//     @Override
//     public List<Student> getAllStudents() {
//         return students;
//     }

//     @Override
//     public boolean deleteStudent(int id) {
//         Iterator<Student> iterator = students.iterator();
//         while (iterator.hasNext()) {
//             Student student = iterator.next();
//             if (student.getId() == id) {
//                 iterator.remove();
//                 // Уменьшаем generalId при удалении студента
//                 Student.generalId--;
//                 saveAllStudentsToFile(); // Сохраняем изменения в файле после удаления
//                 return true;
//             }
//         }
//         return false; // Если студент с указанным id не был найден
//     }
    
//     public void saveAllStudentsToFile() {
//         try {
//             List<String> lines = new ArrayList<>();
//             for (Student student : students) {
//                 lines.add(student.getName() + " " + student.getAge());
//             }
//             Files.write(Path.of(fileName), lines);
//         } catch (IOException e) {
//             System.out.println("Error writing to file: " + e.getMessage());
//         }
//     }
// }





// package Model;

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// import Controller.Interfaces.iGetModel;
// import Model.Domain.Student;

// public class FileModelClass implements iGetModel {

//     private String fileName;
//     private List<Student> students;

//     public FileModelClass(String fileName) {
//         this.fileName = fileName;
//         createFileIfNotExists();
//         loadDataFromFile();
//     }

//     private void createFileIfNotExists() {
//         try {
//             Path path = Path.of(fileName);
//             if (!Files.exists(path)) {
//                 Files.createFile(path);
//             }
//         } catch (IOException e) {
//             System.out.println("Error creating file: " + e.getMessage());
//         }
//     }

//     private void loadDataFromFile() {
//         students = new ArrayList<>();
//         try {
//             List<String> lines = Files.readAllLines(Path.of(fileName));
//             for (String line : lines) {
//                 String[] params = line.split(" ");
//                 students.add(new Student(params[0], Integer.parseInt(params[1])));
//             }
//         } catch (IOException e) {
//             System.out.println("Error reading file: " + e.getMessage());
//         }
//     }

//     private void saveAllStudentsToFile() {
//         try {
//             List<String> lines = new ArrayList<>();
//             for (Student student : students) {
//                 lines.add(student.getName() + " " + student.getAge());
//             }
//             Files.write(Path.of(fileName), lines);
//         } catch (IOException e) {
//             System.out.println("Error writing to file: " + e.getMessage());
//         }
//     }

//     @Override
//     public List<Student> getAllStudents() {
//         return students;
//     }

//     @Override
//     public boolean deleteStudent(int id) {
//         Iterator<Student> iterator = students.iterator();
//         while (iterator.hasNext()) {
//             Student student = iterator.next();
//             if (student.getId() == id) {
//                 iterator.remove();
//                 saveAllStudentsToFile(); // Сохраняем изменения в файле после удаления
//                 return true;
//             }
//         }
//         return false; // Если студент с указанным id не был найден
//     }
// }



// package Model;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.PrintWriter;
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// import Controller.Interfaces.iGetModel;
// import Model.Domain.Student;

// public class FileModelClass implements iGetModel {

//     private String fileName;
//     private List<Student> students; // Хранение данных в памяти

//     public FileModelClass(String fileName) {
//         this.fileName = fileName;
//         createFileIfNotExists();
//         loadDataFromFile(); // Загрузка данных из файла при создании объекта
//     }

//     private void createFileIfNotExists() {
//         try {
//             File file = new File(fileName);
//             if (!file.exists()) {
//                 file.createNewFile();
//             }
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     private void loadDataFromFile() {
//         students = new ArrayList<>();
//         try {
//             File file = new File(fileName);
//             FileReader fr = new FileReader(file);
//             try (BufferedReader reader = new BufferedReader(fr)) {
//                 String line = reader.readLine();
//                 while (line != null) {
//                     String[] param = line.split(" ");
//                     Student student = new Student(param[0], Integer.parseInt(param[1]));
//                     students.add(student);
//                     line = reader.readLine();
//                 }
//             }
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     public void saveAllStudentToFile() {
//         try (FileWriter fw = new FileWriter(fileName)) {
//             PrintWriter writer = new PrintWriter(fw);
//             for (Student student : students) {
//                 writer.println(student.getName() + " " + student.getAge() + " " + student.getId());
//             }
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     @Override
//     public List<Student> getAllStudents() {
//         return students;
//     }

//     @Override
//     public boolean deleteStudent(int id) {
//         boolean deleted = false;
//         Iterator<Student> iterator = students.iterator();
//         while (iterator.hasNext()) {
//             Student student = iterator.next();
//             if (student.getId() == id) {
//                 iterator.remove();
//                 deleted = true;
//                 break;
//             }
//         }
//         if (deleted) {
//             saveAllStudentToFile(); // Сохранение изменений в файл
//         }
//         return deleted;
//     }
// }




// package Model;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.util.ArrayList;
// import java.util.List;

// import Controller.Interfaces.iGetModel;
// import Model.Domain.Student;

// public class FileModelClass implements iGetModel {

//     private String fileName;

//     public FileModelClass(String fileName) {
//         this.fileName = fileName;

//         try(FileWriter fw = new FileWriter(fileName, true))
//         {
//             fw.flush();    
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     public void saveAllStudentToFile(List<Student> students)
//     {
//         try(FileWriter fw = new FileWriter(fileName, true))
//         {
//             for(Student pers : students)
//             {
//                 fw.write(pers.getName()+" "+pers.getAge()+" "+pers.getId());
//                 fw.append('\n');
//             }
//             fw.flush();    
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     @Override
//     public List<Student> getAllStudents() {
//         List<Student> students  = new ArrayList<Student>();
//         try
//         {
//             File file = new File(fileName);
//             FileReader fr = new FileReader(file);
//             BufferedReader reader = new BufferedReader(fr);
//             String line = reader.readLine();
//             while(line!=null)
//             {
//                 String[] param = line.split(" ");
//                 Student pers = new Student(param[0], Integer.parseInt(param[1]));
//                 students.add(pers);
//                 line = reader.readLine();
//             }

//         } catch(Exception e) {
//             System.out.println(e.getMessage());
//         }

//         return students;
//     }    
// }
