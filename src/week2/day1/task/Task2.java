package week2.day1.task;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {0, 21, 3, 4, 56, 8, 5};
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("Количество четных элементов в массиве: " + even);
    }
}
