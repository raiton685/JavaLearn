package week1.day4;

public class Sum1ToN {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 1;
        int result = 1;

        while (num2 <= num1) {
            result += num2;
            num2++;

            System.out.println(result);
        }

    }
}
