package week2.day2;

public class Comparison {
    public static void main(String[] args) {
        int[] array = {3, 7, 6, 44, 9, 33, 56, 2, 45, 1};//{2, 2, 2, 2, 2, 2, 2, 2};
        int sumEven = 0;
        int sumNotEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumNotEven += array[i];
            }
        }
        if (sumEven > sumNotEven) {
            System.out.println("Сумма четных больше");
        } else if (sumEven == sumNotEven) {
            System.out.println("Суммы четных и нечетных равны");
        } else {
            System.out.println("Сумма нечетных больше");
        }
        System.out.println("Сумма четных: " + sumEven + "\n" +
                "Сумма нечетных: " + sumNotEven);
    }
}
