package week3.day2;

public class Counter {
    int value;

    public Counter() {
        value = 0;
    }

    public void increase() {
        value++;
    }

    public int getValue() {
        return value;
    }
}

class Program2 {
    static void main(String[] args) {
        Counter count1 = new Counter();
        count1.increase();
        count1.increase();
        count1.increase();
        count1.increase();
        count1.increase();
        System.out.println(count1.getValue());
    }
}
