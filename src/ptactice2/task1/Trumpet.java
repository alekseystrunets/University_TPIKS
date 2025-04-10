package ptactice2.task1;

public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба, диаметр: " + diameter + " мм, тональность: " + KEY);
    }
}
