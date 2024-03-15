package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Teacher;

public class TeacherService implements iPersonService<Teacher> {

    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        // К сожалению, у нас нет информации о ученой степени при создании учителя,
        // поэтому мы можем просто пропустить этот параметр при вызове create.
        // Мы могли бы предположить некоторое значение по умолчанию для ученой степени,
        // но это зависит от вашего доменного контекста.
        throw new UnsupportedOperationException("Method 'create' with three parameters is not supported for TeacherService");
    }

    public void create(String name, int age, String acadDegree) {
        Teacher teacher = new Teacher(name, age, acadDegree);
        count++;
        teachers.add(teacher);
    }

    public void sortByFIO() {
        PersonComparator<Teacher> persComp = new PersonComparator<>();
        teachers.sort(persComp);
    }
}
