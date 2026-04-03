package week2.day1;

public class AllElements {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 123;
        array[1] = 32;
        array[2] = 56;
        array[3] = 2;
        array[4] = 5;

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
