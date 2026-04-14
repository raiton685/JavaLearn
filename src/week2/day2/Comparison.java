package week2.day2;

public class Comparison {
    public static void main(String[] args) {
        int[] array = {2, 2, 2, 2, 2, 2, 2, 2};//{3, 7, 6, 44, 9, 33, 56, 78, 2};
        int sumEven = 0;
        int sumNotEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumNotEven += array[i];
            }
        }
        if (sumEven == sumNotEven) {
            System.out.println("Суммы равны");
        } else {
            System.out.println("Суммы не равны");
        }
        System.out.println("Сумма четных: " + sumEven + "\n" +
                "Сумма нечетных: " + sumNotEven);
    }
}
