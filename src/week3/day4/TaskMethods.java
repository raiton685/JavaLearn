package week3.day4;

import java.util.ArrayList;

public class TaskMethods {
    public static void main(String[] args) {
        Task test = new Task();
        Task task1 = new Task("Купить цветы", 3);
        Task task2 = new Task("Оплатить интернет", 2);
        Task task3 = new Task("Разобрать гараж", 1);
        Task task4 = new Task("Встреча с партнерами", 5);

        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        task1.setDone(true);
        test.printTasks(tasks);
        Task importantTask = test.findFirstImportantTask(tasks);
        if (importantTask != null) {
        System.out.println("Приоритетная задача: " + importantTask.objective + "\n");
        } else {
            System.out.println("Задачи с высоким приоритетом отсутствуют.\n");
        }

        int done = test.countDoneTask(tasks);
        System.out.println("Количество выполненных задач: " + done);
        System.out.println();

        double average = test.averagePriority(tasks);
        System.out.println("Средний приоритет по задачам: " + average);
        System.out.println(test.containsWord(tasks, "Купить"));

    }
}


class Task {
    String objective;
    int priority;
    boolean done;

    Task() {
    }
    Task(String objective, int priority) {
        this.objective = objective;
        this.priority = priority;
        this.done = false;

    }

    boolean isDone() {
        return done;
    }

    void setDone(boolean done) {
        this.done = done;
    }

    int getPriority() {
        return priority;
    }

    void printTasks(ArrayList<Task> tasks) {
        for (Task task : tasks) {
            System.out.println("Задача: " + task.objective + "\nПриоритет: " + task.priority);
            System.out.println();
        }
    }

     int countDoneTask(ArrayList<Task> tasks) {
        int count = 0;
        for (Task task : tasks) {
            if (task.isDone()) {
                count++;
            }
        }
        return count;
    }

     Task findFirstImportantTask(ArrayList<Task> tasks) {
        if (tasks == null || tasks.isEmpty()) {
            return null;
        }
        for (Task task : tasks) {
            if (!task.isDone() && task.getPriority() >= 5) {
                return task;
            }
        }
        return null;
    }

     double averagePriority(ArrayList<Task> tasks) {
        if (tasks == null || tasks.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Task task : tasks) {
            sum += task.priority;
        }
        return sum / tasks.size();
    }

    public  boolean containsWord(ArrayList<Task> tasks, String word) {
        if (tasks == null || tasks.isEmpty() || word == null || word.isEmpty()) {
            return false;
        }
        String findWord = word.toLowerCase();
        for (Task task : tasks) {
            if (task.objective != null && task.objective.toLowerCase().contains(findWord)) {
                return true;
            }
        }
        return false;
    }
}
