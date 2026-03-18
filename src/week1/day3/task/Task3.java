package week1.day3.task;

public class Task3 {
    public static void main(String[] args) {
        int speedLimit = 60;
        int currentSpeed = 85;
        if (currentSpeed > speedLimit && currentSpeed > 80 && currentSpeed < 101){
            System.out.println("Превышение скорости 20-40 км/ч. Штраф 750 рублей.");
        } else if (currentSpeed > speedLimit && currentSpeed > 100 && currentSpeed < 121){
            System.out.println("Превышение скорости 40-60 км/ч. Штраф 1500 рублей.");
        } else if (currentSpeed > speedLimit && currentSpeed > 120 && currentSpeed < 140){
            System.out.println("Превышение скорости на 60-80 км/ч. Штраф 3000 рублей.");

        }else {
            System.out.println("Нет штрафа");
        }
    }

    }

