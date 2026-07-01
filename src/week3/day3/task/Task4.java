package week3.day3.task;

import java.util.ArrayList;

public class Task4 {
   public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        for (int num : list1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : list2) {
            System.out.print(num + " ");
        }
        System.out.println();
        list1.addAll(list2);

        for (int num : list1) {
            System.out.print(num + " ");
        }
    }
}
