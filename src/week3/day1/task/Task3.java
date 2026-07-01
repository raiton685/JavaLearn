package week3.day1.task;

public class Task3 {
   public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        Worker worker4 = new Worker();
        Worker worker5 = new Worker();
        Worker worker6 = new Worker();

        worker1.name = "Иванов П.А.";
        worker1.post = "Стажер";
        worker1.monthWork = (int) (Math.random() * 24) + 6;
        worker1.salary = 20000;

        worker2.name = "Петров А.А.";
        worker2.post = "Стажер";
        worker2.monthWork = (int) (Math.random() * 24) + 6;
        worker2.salary = 20000;

        worker3.name = "Свиридов Г.Г.";
        worker3.post = "Стажер";
        worker3.monthWork = (int) (Math.random() * 24);
        worker3.salary = 20000;

        worker4.name = "Приветов В.А.";
        worker4.post = "Стажер";
        worker4.monthWork = (int) (Math.random() * 24);
        worker4.salary = 20000;

        worker5.name = "Сидоров П.К.";
        worker5.post = "Стажер";
        worker5.monthWork = (int) (Math.random() * 24);
        worker5.salary = 20000;

        worker6.name = "Валуев С.Н.";
        worker6.post = "Стажер";
        worker6.monthWork = (int) (Math.random() * 24);
        worker6.salary = 20000;

        worker1.workerRaising(worker1);
        worker2.workerRaising(worker2);
        worker3.workerRaising(worker3);
        worker4.workerRaising(worker4);
        worker5.workerRaising(worker5);
        worker6.workerRaising(worker6);
    }
}


class Worker {
    String name;
    String post;
    int monthWork;
    int salary;


    void workerRaising(Worker worker1) {
        if (worker1.monthWork > 6 && worker1.monthWork < 11) {
            worker1.post = "Продавец - консультант";
            worker1.salary += 5000;
            System.out.printf("Сотрудник %s, повышен до должности %s.", worker1.name, worker1.post);
        } else if (worker1.monthWork  > 12 && worker1.monthWork < 17) {
            worker1.post = "Старший продавец";
            worker1.salary += 10000;
            System.out.printf("Сотрудник %s, повышен до должности %s.", worker1.name, worker1.post);
        } else if (worker1.monthWork > 18 && worker1.monthWork < 24) {
            worker1.post = "Менеджер";
            worker1.salary += 15000;
            System.out.printf("Сотрудник %s, повышен до должности %s.", worker1.name, worker1.post);
        } else if (worker1.monthWork > 24) {
            worker1.post = "Старший менеджер";
            worker1.salary += 20000;
            System.out.printf("Сотрудник %s, повышен до должности %s.", worker1.name, worker1.post);
        }
        System.out.println();
        System.out.printf("Имя сотрудника: %s \nДолжность: %s \nРаботает месяцев: %d \n" +
                "Зарплата: %d \n\n", worker1.name, worker1.post, worker1.monthWork, worker1.salary);
    }
}