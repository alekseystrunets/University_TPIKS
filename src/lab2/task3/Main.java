package lab2.task3;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Димас", "О Житухе", 2020, 250);
        book1.displayInfo("О Житухе");

        book1.changeAuthor();
        book1.changeTitle();
        book1.changeYear();
        book1.changePages();

        book1.displayInfo("О Житухе");
    }
}
