/*
 * Класс Student представляет студента и наследует от абстрактного класса Person.
 */
package Model.Domain;

public class Student extends Person implements Comparable<Student> {
    private int id;
    public static int generalId = 0;

    /**
     * Конструктор класса Student.
     *
     * @param name Имя студента.
     * @param age Возраст студента.
     * @param id Уникальный идентификатор студента.
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    /**
     * Возвращает идентификатор студента.
     *
     * @return Идентификатор студента.
     */
    public int getId() {
        return id;
    }

    /**
     * Переопределение метода toString для вывода информации о студенте.
     *
     * @return Строка, содержащая информацию о студенте.
     */
    @Override
    public String toString() {
        return "Student [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    /**
     * Метод сравнения студентов для сортировки.
     *
     * @param o Студент для сравнения.
     * @return 0, если студенты равны; 1, если данный студент больше переданного; -1, если данный студент меньше переданного.
     */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (id == o.id) return 0;
            if (id > o.id) return 1;
            else return -1;
        }
        if (super.getAge() > o.getAge()) return 1;
        else return -1;
    }    
}


// package Model.Domain;

// public class Student extends Person implements Comparable<Student> {
//     private int id;
//     public static int generalId = 0;

//     public Student(String name, int age, int id) {
//         super(name, age);
//         this.id = id;
//     }

//     public int getId() {
//         return id;
//     }

//     @Override
//     public String toString() {
//         return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
//     }

//     @Override
//     public int compareTo(Student o) {

//         System.out.println(super.getName()+" - "+o.getName());
//         if(super.getAge()==o.getAge())
//         {
//             if(id==o.id)return 0 ;
//             if(id>o.id)return 1;
//             else return -1;
//             //return 0;
//         }

//         if(super.getAge()>o.getAge())
//         return 1;
//         else
//         return -1;        
//     }    
// }
