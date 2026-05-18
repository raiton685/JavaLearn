package week3.day2.Task;

public class Task4 {
    static void main(String[] args) {
        Person person1 = new Person("Кирилл", 6);
        Person person2 = new Person("Максим", 17);
        Person person3 = new Person("Дмитрий", 67);

        String result = person3.personAgeType();
        System.out.println("Человек по имени " + person3.name + " - " + result);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String personAgeType() {
        if (age < 12) {
            return "Ребёнок";
        } else if (age < 18) {
            return "Подросток";
        } else {
           return "Взрослый";
        }
    }
}