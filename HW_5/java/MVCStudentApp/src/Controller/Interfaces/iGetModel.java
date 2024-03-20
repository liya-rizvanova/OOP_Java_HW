/*
 * Этот интерфейс определяет методы для взаимодействия с уровнем модели для получения данных о студентах.
 */
package Controller.Interfaces;

import Model.Domain.Student;
import java.util.List;

public interface iGetModel {

    /**
     * Получает список всех студентов из уровня модели.
     *
     * @return Список объектов Student, представляющих всех студентов в системе.
     */
    List<Student> getAllStudents();

    /**
     * Удаляет студента с указанным идентификатором из уровня модели.
     *
     * @param id Идентификатор удаляемого студента.
     * @return true, если студент успешно удален, в противном случае - false.
     */
    boolean deleteStudent(int id);
}



// package Controller.Interfaces;

// import Model.Domain.Student;
// import java.util.List;

// public interface iGetModel {
//     List<Student> getAllStudents();
//     boolean deleteStudent(int id);
// }



// package Controller.Interfaces;

// import java.util.List;

// import Model.Domain.Student;

// public interface iGetModel {
//     public List<Student> getAllStudents();
// }
