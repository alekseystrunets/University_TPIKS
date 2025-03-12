package lab2.task3;

import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    private int year;
    private int pages;

    public Book() {
        this.author = "";
        this.title = "";
        this.year = 0;
        this.pages = 0;
    }

    public Book(String author, String title, int year, int pages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void changeAuthor() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите нового автора: ");
        this.author = scan.nextLine();
    }

    public void changeTitle(String newTitle) {
        this.title = newTitle;
    }

    public void changeTitle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите новое название: ");
        this.title = scan.nextLine();
    }

    public void changeYear(int newYear) {
        this.year = newYear;
    }

    public void changeYear() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите новый год выпуска: ");
        this.year = scan.nextInt();
    }

    public void changePages(int newPages) {
        this.pages = newPages;
    }

    public void changePages() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите новое количество страниц: ");
        this.pages = scan.nextInt();
    }

    public void displayInfo(String title) {
        if (this.title.toLowerCase().equals(title.toLowerCase())) {
            System.out.println("Автор: " + author);
            System.out.println("Название: " + title);
            System.out.println("Год выпуска: " + year);
            System.out.println("Количество страниц: " + pages);
        } else {
            System.out.println("Книга с названием \"" + title + "\" не найдена.");
        }
    }
}
