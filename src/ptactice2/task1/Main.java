package ptactice2.task1;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[] {
                new Guitar(6),
                new Drum(40),
                new Trumpet(120)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}