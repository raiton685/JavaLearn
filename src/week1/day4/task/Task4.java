package week1.day4.task;

public class Task4 {

    public void showInformation() {
        System.out.println("Test123");

    }


    public static void main(String[] args) {
       Task4 ts1 = new Task4();

        int num = 100;
        while (num > 0) {
            num -= 10;

            ts1.showInformation();

        }

    }


}
