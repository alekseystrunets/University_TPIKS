package lab3.task4;

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title);
    }

    public String getTitle() {
        return title;
    }

    public static void printMagazines(Printable[] printables) {
        System.out.println("List of Magazines:");
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                ((Magazine) printable).print();
            }
        }
    }
}
