package week3.day3.task;

import java.util.ArrayList;

public class Task5 {
    static void main(String[] args) {
        Task task1 = new Task("Закрыть неделю по учебе", 1);
        Task task2 = new Task("Закупки в магазине", 5);
        Task task3 = new Task("Приготовить еду на 2 дня", 7);
        Task task4 = new Task("Помыть духовку", 10);
        Task task5 = new Task("Отремонтировать автомобиль", 2);

        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        taskList.add(task5);
        task1.setDone(true);
        task2.setDone(true);
        task1.showList(taskList);
    }
}

class Task {
    String objective;
    int priority;
    boolean done;

    Task(String objective, int priority) {
        this.objective = objective;
        this.priority = priority;
        this.done = false;
    }

    void setDone(boolean done) {
        this.done = done;
    }


    void showList(ArrayList<Task> list) {
        for (Task task : list) {
            System.out.println("Задача: " + task.objective + "\nПриоритет: " + task.priority + "\nСтатус выполнения: " + task.done);
            System.out.println();
        }
    }

}