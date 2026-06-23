package week3.day5;

import java.util.ArrayList;

public class Movie {
    String title;
    double rating;

    Movie() {
    }

    Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public void addMovie(ArrayList<Movie> list, String title, double rating) {
        list.add(new Movie(title, rating));
    }

    public void showList(ArrayList<Movie> list) {
        if (list.isEmpty()) {
            System.out.println("Список пуст!");
        }
        int count = 1;
        System.out.println("Список фильмов:");
        for (Movie movie : list) {
            System.out.printf(count++ + ") %s. Рейтинг: %.1f.\n", movie.title, movie.rating);
        }
        System.out.println();
    }

    double averageRating(ArrayList<Movie> list) {
        if (list.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Movie movie : list) {
            sum += movie.rating;
        }
        return sum / list.size();
    }
}

class Program {
    static void main(String[] args) {
        Movie test = new Movie();
        ArrayList<Movie> topRatedList = new ArrayList<>();
        ArrayList<Movie> lowRatedList = new ArrayList<>();
        test.addMovie(topRatedList, "Властелин колец", 10.0);
        test.addMovie(topRatedList, "Криминальное чтиво", 9.8);
        test.addMovie(topRatedList, "Назад в будущее", 8.6);
        test.addMovie(topRatedList, "Матрица", 9.2);

        test.showList(topRatedList);

        test.addMovie(lowRatedList, "Судный день", 4.5);
        test.addMovie(lowRatedList, "Битва за Лос-Анджелес", 2.3);
        test.addMovie(lowRatedList, "Зомби", 4.0);
        test.addMovie(lowRatedList, "Ускорение", 4.8);

        test.showList(lowRatedList);

        double topRatedAverage = test.averageRating(topRatedList);
        double lowRatedAverage = test.averageRating(lowRatedList);
        System.out.printf("Средняя оценка хороших фильмов - %.1f\nСредняя оценка плохих фильмов - %.1f\n\n", topRatedAverage, lowRatedAverage);

        ArrayList<Movie> allMovie = new ArrayList<>();
        allMovie.addAll(lowRatedList);
        allMovie.addAll(topRatedList);
        test.showList(allMovie);

        double allAverage = test.averageRating(allMovie);
        System.out.printf("Средняя оценка по всем фильмам - %.1f", allAverage);
        System.out.println();
    }
}