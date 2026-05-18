package week3.day3.task;

import java.util.ArrayList;

public class Task3 {

    boolean teamCapacity(ArrayList<String> team) {
        return   team.size() == 11;
    }

    static void main(String[] args) {
        Task3 test = new Task3();
        ArrayList<String> footballTeam = new ArrayList<>(11);
        footballTeam.add("№ 1 Антонов");
        footballTeam.add("№ 4 Иванов");
        footballTeam.add("№ 11 Сидоров");
        footballTeam.add("№ 6 Макаров");
        footballTeam.add("№ 7 Вавилов");
        footballTeam.add("№ 19 Бахрушев");
        footballTeam.add("№ 5 Антонов");
        footballTeam.add("№ 8 Дурыкин");
        footballTeam.add("№ 2 Армейцев");
        footballTeam.add("№ 3 Смирнов");
        footballTeam.add("№ 14 Канатов");
        footballTeam.remove(1);

        if (test.teamCapacity(footballTeam)) {
            System.out.println("Команда полная, может принять участие в матче.");
        } else {
            System.out.println("Добавьте игроков в команду, чтобы принять участие в матче.");
        }
    }
}
