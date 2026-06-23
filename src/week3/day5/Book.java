package week3.day5;

import java.util.ArrayList;

public class Book {
    String title;
    String author;
    int year;
    boolean read;

    Book() {
    }

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void setRead(boolean read) {
        this.read = read;
    }

    boolean isRead() {
        return read;
    }

    int unreadBook(ArrayList<Book> books) {
        int count = 0;
        for (Book book : books) {
            if (!book.isRead()) {
                count++;
            }
        }
        return count;
    }

    Book findBook(ArrayList<Book> bookList, String searchAuthor) {
        if (bookList == null || bookList.isEmpty()
                || searchAuthor == null || searchAuthor.isEmpty()) {
            return null;
        }
        String search = searchAuthor.toLowerCase();
        for (Book book : bookList) {
            if (book.author != null && book.author.toLowerCase().contains(search)) {
                return book;
            }
        }
        return null;
    }
}

class Library {
    static void main(String[] args) {
        Book test = new Book();
        Book book1 = new Book("Парфюмер", "Патрик Зюскинд", 1985);
        Book book2 = new Book("Облачный атлас", "Дэвид Митчелл", 2004);
        Book book3 = new Book("Бойня номер пять", "Курт Воннегут", 1969);
        Book book4 = new Book("Женщина в песках", "Кобо Абэ", 1962);
        Book book5 = new Book("Гарри Поттер и филосовский камень", "Джоан Роулинг", 1997);
        Book book6 = new Book("Сто лет одиночества", "Габриэль Гарсиа Маркес", 1967);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);


        Book findB = test.findBook(bookList, "Гарсиа");
        if (findB == null) {
            System.out.println("Нет такого автора");
        } else {
            System.out.printf("Найдена книга автора %s, %s, %d г.\n", findB.author, findB.title, findB.year);
        }
        int count = test.unreadBook(bookList);
        System.out.printf("Непрочитанные книги: %d шт.", count);
    }
}