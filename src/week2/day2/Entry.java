package week2.day2;

public class Entry {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 54, 6, 7, 1, 4, 5, 2};
        int findNum = 2;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findNum) {
                count++;
            }
        }
        System.out.println("Количество вхождений числа " + findNum + ": " + count);
    }
}
