package week2.day1;

public class ArraySumm {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 8, 4, 3};
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];

        }
        System.out.println(summ);

    }
}
