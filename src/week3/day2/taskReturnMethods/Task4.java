package week3.day2.taskReturnMethods;

public class Task4 {
   public static void main(String[] args) {
        Person ivan = new Person("Иван", 21);
        Person anton = new Person("Антон", 17);
        ivan.showAdult();
        anton.showAdult();
    }

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age > 18;
    }

    public void showAdult() {
        if (isAdult()) {
            System.out.println("Человек совершеннолетний");
        } else {
            System.out.println("Человек несовершеннолетний");
        }
    }
}