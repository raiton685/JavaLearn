package week1.day3.task;

public class Task2 {
    public static void main(String[] args) {
        String color = "Red";
        if(color=="Green"){
            System.out.println("Сигнал светофора зеленый, можно ехать.");
        } else if (color=="Yellow") {
            System.out.println("Сигнал светофора желтый, приготовится к движению.");
        }else if (color=="Red"){
            System.out.println("Сигнал светофора красный, движение запрещено.");
        }else {
            System.out.println("Неверное значение");
        }
        }

    }

