package week3.day3.task;

import java.util.ArrayList;

public class Task1 {
   public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Молоко");
        list.add("Овсянка");
        list.add("Яйца");
        list.add("Морковь");
        list.add("Картофель");
        list.set(0, "Молоко +");
        list.set(3, "Морковь +");
        list.set(4, "Картофель +");
        list.removeIf(prod -> prod.contains("+"));
        //list.clear();

        for (String product : list) {
            System.out.println(product);
        }

    }
}
