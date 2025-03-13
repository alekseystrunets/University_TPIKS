package lab3.task4;

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }

    public String getTitle() {
        return title;
    }

    public static void printBooks(Printable[] printables) {
        System.out.println("List of Books:");
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                ((Book) printable).print();
            }
        }
    }
}
