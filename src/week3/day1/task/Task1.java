package week3.day1.task;

public class Task1 {
    static void main(String[] args) {
        Car car1 = new Car("Черный", "Универсал", "Удовлетворительное", 2008, 135);
        Car car2 = new Car("Синий", "Лифтбек", "Хорошее", 2021, 195);
        Car car3 = new Car("Бежевый металлик", "Хэтчбек", "Плохое", 2011, 115);

        car1.carInfo();
        car2.carInfo();
        car3.carInfo();
       /* car1.color = "Черный";
        car1.bodyType = "Универсал";
        car1.condition = "Удовлетворительное";
        car1.year = 2008;
        car1.enginePower = 135;

        car2.color = "Синий";
        car2.bodyType = "Лифтбек";
        car2.condition = "Хорошее";
        car2.year = 2021;
        car2.enginePower = 195;

        car3.color = "Бежевый металлик";
        car3.bodyType = "Хэтчбек";
        car3.condition = "Плохое";
        car3.year = 2011;
        car3.enginePower = 115; */


    }
}

class Car {
    String color;
    String bodyType;
    String condition;
    int year;
    int enginePower;

    public Car(String color, String bodyType, String condition, int year, int enginePower) {
        this.color = color;
        this.bodyType = bodyType;
        this.condition = condition;
        this.year = year;
        this.enginePower = enginePower;
    }

    public double carPriceCalculator() {
        double price = 0;
        if (year < 2015) {
            price = 500000;
        } else if (year < 2020) {
            price = 1100000;
        } else {
            price = 2000000;
        }

        if (enginePower < 100) {
            price *= 2;
        } else if (enginePower < 200) {
            price *= 2.6;
        } else {
            price *= 3;
        }
        if (condition.equals("Плохое")) {
            price -= 400000;
        } else if (condition.equals("Удовлетворительное")) {
            price -= 250000;
        } else if (condition.equals("Хорошее")) {
            price -= 150000;
        }
        return price;
    }

    public void carInfo() {
        double price = carPriceCalculator();
        System.out.printf("Автомобиль с кузовом %s, цвет по документам: %s, год выпуска: %d, мощность двигателя: %d лс." +
                " \nОбщее состояние: %s. \nИтоговоя стоимость: %.1f руб.\n", bodyType, color, year, enginePower, condition, price);

        System.out.println();
    }


}
