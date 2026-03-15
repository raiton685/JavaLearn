package Week1.Day5;

public class Temperature {

    public int celsiusToFahrenheit(int celsius){
        int result;
        result = celsius * 9/5 + 32;
    return result;
    }

}

class Test30 {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature();
        int test = temp1.celsiusToFahrenheit(180);
        System.out.println(test);

    }

}