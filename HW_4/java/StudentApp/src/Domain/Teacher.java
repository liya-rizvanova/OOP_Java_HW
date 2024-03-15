package Domain;

public class Teacher extends Person implements Comparable<Teacher> {
    private String acadDegree;
    private int id;
    private static int generalId;

    public Teacher(String name, int age, String acadDegree) {
        super(name, age);
        this.acadDegree = acadDegree;
        this.id = generalId++;
    }

    @Override
    public String toString() {
        return "Teacher [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Teacher o) {
        if (super.getAge() == o.getAge()) {
            return super.getName().compareTo(o.getName());
        } else {
            return Integer.compare(super.getAge(), o.getAge());
        }
    }

    public String getAcadDegree() {
        return acadDegree;
    }
}
