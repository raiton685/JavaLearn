package week3.day2;

public class Temperature {
    int degrees;

    public Temperature(int degrees) {
        this.degrees = degrees;
    }

    public boolean isNegative(Temperature temp) {
        return temp.degrees < 0;
    }

}

class Program1 {
    static void main(String[] args) {
        Temperature temp1 = new Temperature(12);
        Temperature temp2 = new Temperature(-35);
        Temperature temp3 = new Temperature(0);

        System.out.println(temp1.isNegative(temp1));
        System.out.println(temp2.isNegative(temp2));
        System.out.println(temp3.isNegative(temp3));
    }

}