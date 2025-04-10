package practice1.task5;

public class Main {
    public static void main(String[] args) {
        Kitten myKitten = new Kitten(1.5, 0, "Мурзик", "08:00");
        System.out.println(myKitten.displayInfo());

        myKitten.setMiceCaught(2);
        myKitten.setFeedingTime("12:00");
        System.out.println(myKitten.displayInfo());

        Kitten anotherKitten = new Kitten(myKitten);
        System.out.println(anotherKitten.displayInfo());
    }
}
