package ptactice2.task1;

public class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, размер: " + size + " см, тональность: " + DRUM_KEY);
    }
}
