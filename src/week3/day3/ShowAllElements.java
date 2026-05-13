package week3.day3;

import java.util.ArrayList;

public class ShowAllElements {

    void showList(ArrayList<String> list) {
        for (String word : list) {
            System.out.println(word + " ");
        }
    }

    static void main(String[] args) {
        ShowAllElements test = new ShowAllElements();
        ArrayList<String> days = new ArrayList<>(7);
        days.add("Понедельник");
        days.add("Вторник");
        days.add("Среда");
        days.add("Четверг");
        days.add("Пятница");
        days.add("Суббота");
        days.add("Воскресенье");
        test.showList(days);
    }
}
