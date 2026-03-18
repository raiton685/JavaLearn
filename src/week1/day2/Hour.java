package week1.day2;

public class Hour {

    public static void main(String[] args) {
        int allMinutes = 890;

        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;
        System.out.println("Количество часов и минут: " + hours + ":" + minutes);

    }
}

