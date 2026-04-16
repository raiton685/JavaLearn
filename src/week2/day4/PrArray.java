package week2.day4;

public class PrArray {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 7, 8, 6, 45, 32};
        int[] array1 = {2, 5, 6, 7, 8, 6, 45, 32, 55, 44, 33};
        PrArray print = new PrArray();
        print.printArray(array);
        print.printArray(array1);

    }
}

