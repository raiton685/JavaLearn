package week2.day5;

import java.util.Scanner;

public class ArraySort {
    Scanner in = new Scanner(System.in);

    public void sortArray(int[] array) {
        boolean sort = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sort = false;
                break;
            } else {
                sort = true;
            }
        }
        if (sort) {
            System.out.println("Массив отсортирован");
            showArray(array);
        } else {
            showArray(array);
            System.out.println("Массив не отсортирован" + "\n"
                    + "Выполнить сортировку?" + "\n" + "Введите [Yes] или [No]");
            String answer = in.next();
            if (answer.equals("Yes")) {
                sortAndShow(array);
            } else {
                System.out.println("Работа программы завершена");
            }
        }
    }

    public void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void sortAndShow(int[] array) {
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
        System.out.println("\n" + "Сортировка зававершена");
    }

    public static void main(String[] args) {
        ArraySort sort1 = new ArraySort();
        int[] array = {2, 6, 1, 5, 7, 85, 34, 22, 90, 2, 4, 6, 9};
        int[] array1 = {1, 3, 5, 7, 9, 89, 567, 988, 4567};
        sort1.sortArray(array);

    }
}
