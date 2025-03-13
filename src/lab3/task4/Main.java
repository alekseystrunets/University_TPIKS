package lab3.task4;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("The Great Gatsby"),
                new Magazine("Time"),
                new Book("1984"),
                new Magazine("National Geographic"),
                new Book("Moby Dick"),
                new Magazine("Vogue")
        };

        for (Printable printable : printables) {
            printable.print();
        }

        Book.printBooks(printables);

        Magazine.printMagazines(printables);
    }
}
