package week3.day2.Task;

public class Task3 {
    static void main(String[] args) {
        Figure figure1 = new Figure(8, 8);
        Figure figure2 = new Figure(4, 4);
        Figure figure3 = new Figure(3, 5);

        System.out.println("Периметр фигуры: " + figure1.perimetr() + "\n");
        System.out.println("Периметр фигуры: " + figure2.perimetr() + "\n");
        System.out.println("Периметр фигуры: " + figure3.perimetr() + "\n");

    }

}

class Figure {

    int firstSide;
    int secondSide;

    Figure(int side1, int side2) {
        firstSide = side1;
        secondSide = side2;

    }

    public int perimetr() {
        if (firstSide == secondSide) {
            System.out.println("Это квадрат");
            return firstSide * 4;
        } else {
            System.out.println("Это прямоугольник");
            return 2 * (firstSide + secondSide);
        }
    }
}
