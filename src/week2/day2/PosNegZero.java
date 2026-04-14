package week2.day2;

public class PosNegZero {
    public static void main(String[] args) {
        int[] array = {-22, 56, 0, -4, 6, 6, 7, 0, -6, -8, 3};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Положительные: " + positive + "\n" +
                "Отрицательные: " + negative + "\n" + "Нули: " + zero);
    }
}
