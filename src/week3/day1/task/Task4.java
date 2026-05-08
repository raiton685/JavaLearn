package week3.day1.task;

public class Task4 {
    static void main(String[] args) {
        BookRate book1 = new BookRate();
        BookRate book2 = new BookRate();
        BookRate book3 = new BookRate();
        BookRate book4 = new BookRate();
        BookRate book5 = new BookRate();
        BookRate book6 = new BookRate();
        BookRate book7 = new BookRate();
        BookRate book8 = new BookRate();
        BookRate book9 = new BookRate();
        BookRate book10 = new BookRate();

        book1.title = "Гордость и предубеждение";
        book1.author = "Джейн Остин";
        book1.rating = 9.1;

        book2.title = "1984";
        book2.author = "Джордж Оруэлл";
        book2.rating = 8.1;

        book3.title = "Мастер и Маргарита";
        book3.author = "Михаил Булгаков";
        book3.rating = 9.6;

        book4.title = "Великий Гэтсби";
        book4.author = "Фрэнсис Скотт Фицджеральд";
        book4.rating = 8.8;

        book5.title = "451 градус по Фаренгейту";
        book5.author = "Рэй Брэдбери";
        book5.rating = 9.8;

        book6.title = "Преступление и наказание";
        book6.author = "Фёдор Достоевский";
        book6.rating = 9.9;

        book7.title = "Норвежский лес";
        book7.author = "Харуки Мураками";
        book7.rating = 7.9;

        book8.title = "Война и мир";
        book8.author = "Лев Толстой";
        book8.rating = 10.0;

        book9.title = "Грозовой перевал";
        book9.author = "Эмили Бронте";
        book9.rating = 9.0;

        book10.title = "О дивный новый мир";
        book10.author = "Олдос Хаксли";
        book10.rating = 9.2;


        BookRate[] books = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        double max = books[0].rating;
        for (int i = 0; i < books.length; i++) {
            if (books[i].rating > max) {
                max = books[i].rating;
            }
        }
        System.out.println("Книга с самым высоким рейтингом в списке: " + max);
    }
}


class BookRate {
    String title;
    String author;
    double rating;
}