package week2.day5;

public class StatGrade {

    public void statGradeInfo(int[] array) {
        String subject = "Оценки по информатике";
        String gradeFive = "Количество пятерок: ",
                gradeFour = "Количество четверок: ",
                gradeThree = "Количество троек: ";
        String averageGrade = "Средняя оценка за четверть: ";
        int five = 0;
        int four = 0;
        int three = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                five++;
            } else if (array[i] == 4) {
                four++;
            } else {
                three++;
            }
        }
        int average = (5 * five + 4 * four + 3 * three) / (five + four + three);
        System.out.println(subject + "\n" + gradeFive + five + "\n"
                + gradeFour + four + "\n" + gradeThree + three + "\n"
                + averageGrade + average);
    }
    public static void main(String[] args) {
        StatGrade stat1 = new StatGrade();
        int[] grade = {3, 5, 5, 4, 4, 3, 4, 5, 5, 4, 3, 3, 3, 5, 5};
        stat1.statGradeInfo(grade);
    }
}
