package week1.day4.task;

public class Task3 {
    public static void main(String[] args) {

        int celsius = 35;
        while (celsius > 0) {
            celsius--;
            System.out.println("Температура в Цельсиях: \n" + celsius + " С");
            System.out.println("Температура в Фаренгейтах: \n" + (celsius * 9 / 5 + 32) + " F" + "\n");
        }

    }


}

