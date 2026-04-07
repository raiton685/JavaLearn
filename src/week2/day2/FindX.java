package week2.day2;

public class FindX {
    public static void main(String[] args) {
        int[] array = {12, 23, 45, 67, 7, 4, 6, 7, 9};
        int findNum = 7;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findNum) {
                System.out.println("Индекс искомого числа: " + i + ". "
                        + " Значение элемента: " + array[i] + ".");
            }
        }
    }
}
