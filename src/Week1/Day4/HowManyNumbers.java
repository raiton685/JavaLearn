package Week1.Day4;

public class HowManyNumbers {
    public static void main(String[] args) {
        int num1 = 348575553;
        int numbers = 0;
        for (int num3 = num1; num3 > 0; num3 /= 10) {
            numbers++;
        }
        System.out.println(numbers);
    }
}
