/*
 * Пакет Model содержит классы, относящиеся к бизнес-логике и управлению данными.
 */
package Model;

import Model.Domain.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelClassHash implements Controller.Interfaces.iGetModel {

    private Map<Integer, Student> studentsMap;

    /**
     * Конструктор класса ModelClassHash.
     *
     * @param students Список студентов, которые будут добавлены в хеш-таблицу.
     */
    public ModelClassHash(List<Student> students) {
        this.studentsMap = new HashMap<>();
        for (Student student : students) {
            this.studentsMap.put(student.getId(), student);
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentsMap.values());
    }

    @Override
    public boolean deleteStudent(int id) {
        if (studentsMap.containsKey(id)) {
            studentsMap.remove(id);
            return true;
        }
        return false;
    }
}


// package Model;

// import Model.Domain.Student;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class ModelClassHash implements Controller.Interfaces.iGetModel {

//     private Map<Integer, Student> studentsMap;

//     public ModelClassHash(List<Student> students) {
//         this.studentsMap = new HashMap<>();
//         for (Student student : students) {
//             this.studentsMap.put(student.getId(), student);
//         }
//     }

//     @Override
//     public List<Student> getAllStudents() {
//         return new ArrayList<>(studentsMap.values());
//     }

//     @Override
//     public boolean deleteStudent(int id) {
//         if (studentsMap.containsKey(id)) {
//             studentsMap.remove(id);
//             return true;
//         }
//         return false;
//     }
// }



// package Model;

// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// import Controller.Interfaces.iGetModel;
// import Model.Domain.Student;

// public class ModelClassHash implements iGetModel {

//     private Map<Integer, Student> studentsMap;

//     public ModelClassHash(List<Student> students) {
//         this.studentsMap = new HashMap<>();
//         for (Student student : students) {
//             this.studentsMap.put(student.getId(), student);
//         }
//     }

//     @Override
//     public List<Student> getAllStudents() {
//         return List.copyOf(studentsMap.values());
//     }
// }
