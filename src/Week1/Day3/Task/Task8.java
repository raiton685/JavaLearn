package Week1.Day3.Task;
import java.util.Objects; // IDEA подсказала
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите команду для получения информации (weather, date, traffic): ");
        String info = in.next();
        if(Objects.equals(info, "weather")){ // IDEA подсказала
            System.out.println("8 марта днем погода облачная и холодная. " +
                    "Днем температура в пределах от -3 до 0°, ночью до -3. " +
                    "Умеренный ветер около 2 м/с, порывами до 9 м/с." +
                    " Погодные карты на 8 марта дают снегопад между 13:00 и 16:00.");
        } else if (Objects.equals(info, "date")) { // IDEA подсказала
            System.out.println("Воскресенье, 8 марта 2026 г.");

        } else if (Objects.equals(info, "traffic")) { // IDEA подсказала
            System.out.println("Пробки вечером 8 марта в Москве достигли 8 баллов");

        }


    }
}
