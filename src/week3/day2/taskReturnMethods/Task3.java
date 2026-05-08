package week3.day2.taskReturnMethods;

public class Task3 {

    public boolean isEven(int num) {
        return num % 2 == 0;

    }

    static void main(String[] args) {
        Task3 test = new Task3();
        boolean even = test.isEven(9);
        if (even) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
