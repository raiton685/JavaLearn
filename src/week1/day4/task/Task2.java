package week1.day4.task;

public class Task2 {
    public static void main(String[] args) {
        int num = 100;
        while (num > 0) {
            num--;
            if (num % 2 == 0){
                System.out.println(num + " - четное.");
            } else {
                System.out.println(num + " - нечетное.");
            }
        }

    }
}
