package week2.day4;

public class ContainsNum {
    public void containsNumber(int[] array, int num) {
        boolean foundNum = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("Массив содержит число: " + num + ". " + "Индекс: " + i);
                foundNum = true;
            }
        }
        if (!foundNum) {
            System.out.println("В массиве нет числа: " + num);
        }
    }

    public static void main(String[] args) {
        ContainsNum con1 = new ContainsNum();
        int[] array = {23, 65, 7, 6, 88, 9, 0, 87};
        int[] array1 = {4, 4, 5, 6, 7, 8, 9, 4, 7};
        con1.containsNumber(array, 100);
        con1.containsNumber(array1, 4);
    }


}
