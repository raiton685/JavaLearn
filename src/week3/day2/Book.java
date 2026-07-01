package week3.day2;

public class Book {
    String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title; // 1
        this.pages = pages; // 2
    }

    public boolean isLongBook(Book book) {
        return book.pages > 350;
    }

}

class Program {
   public static void main(String[] args) {
        Book book1 = new Book("Преступление и наказание", 672);
        Book book2 = new Book("Обломов", 448);
        Book book3 = new Book("Мертвые души", 380);
        Book book4 = new Book("Евгений Онегин", 320);
        Book book5 = new Book("Анна Каренина", 800);

        System.out.println(book1.isLongBook(book1));
        System.out.println(book2.isLongBook(book2));
        System.out.println(book3.isLongBook(book3));
        System.out.println(book4.isLongBook(book4));
        System.out.println(book5.isLongBook(book5));

    }
}