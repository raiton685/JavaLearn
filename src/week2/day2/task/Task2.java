package week2.day2.task;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 2, 56, 33, 222, 78, 56, 98, 45, 3, 66, 8, 9, 0};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int num = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            System.out.print(num + " ");

        }
    }
}
