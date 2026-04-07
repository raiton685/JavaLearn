package week2.day1.task;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {10, 8, 33, 56, 3, 2, 7};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
           min = array[i];
            }
        }
        System.out.println("Минимальное значение элемента массива: " + min);
    }
}
