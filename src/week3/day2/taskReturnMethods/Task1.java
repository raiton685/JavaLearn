package week3.day2.taskReturnMethods;

public class Task1 {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }


   public static void main(String[] args) {
        Task1 test = new Task1();

        int result = test.sum(5, 6);
        System.out.println(result);
    }
}
