package week2.day1.task;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {-2, -6, 67, -5, 24, 76, -1};
        int positive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            }
        }
        System.out.println("Количество положительных элементов в массиве: " + positive);
    }
}