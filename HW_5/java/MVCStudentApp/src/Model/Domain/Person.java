/*
 * Абстрактный класс Person представляет базовую информацию о человеке.
 */
package Model.Domain;

public abstract class Person {
    private String name; // Имя человека
    private int age;     // Возраст человека

    /**
     * Конструктор класса Person.
     *
     * @param name Имя человека.
     * @param age Возраст человека.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Получает имя человека.
     *
     * @return Имя человека.
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя человека.
     *
     * @param name Новое имя человека.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает возраст человека.
     *
     * @return Возраст человека.
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает возраст человека.
     *
     * @param age Новый возраст человека.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Представляет объект Person в виде строки.
     *
     * @return Строковое представление объекта Person.
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}


// package Model.Domain;

// public abstract class Person {
//     private String name;
//     private int age;
    
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     @Override
//     public String toString() {
//         return "Person [name=" + name + ", age=" + age + "]";
//     }    
// }
