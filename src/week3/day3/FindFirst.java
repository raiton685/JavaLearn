package week3.day3;

import java.util.ArrayList;

public class FindFirst {
    static void main(String[] args) {
        Book book1 = new Book("Сказки", 237);
        Book book2 = new Book("История 5 класс", 178);
        Book book3 = new Book("Анатомия", 1432);
        Book book4 = new Book("Стихи", 300);
        Book book5 = new Book("Азбука", 20);
        Book book6 = new Book("Анекдоты", 70);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        Book bookTest = book1.findFirstObject(books);
        System.out.println(bookTest.title);
    }
}

class Book {
    String title;
    int pages;

    Book(String title1, int pages1) {
        title = title1;
        pages = pages1;
    }

    Book findFirstObject(ArrayList<Book> books) {
        for (Book book : books) {
            if (book.pages > 1000) {
                return book;
            }
        }
        return null;
    }

}