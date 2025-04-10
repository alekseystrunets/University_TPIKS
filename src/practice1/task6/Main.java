package practice1.task6;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat(4.0, 3, "Василиса");
        Dog myDog = new Dog(10.0, 5, "Бобик", "Лабрадор");

        Kitten myKitten = new Kitten(1.5, 0, "Мурзик", "08:00");

        System.out.println(myCat.displayInfo());
        System.out.println("Голос: " + myCat.voice());

        System.out.println(myDog.displayInfo());
        System.out.println("Голос: " + myDog.voice());

        System.out.println(myKitten.displayInfo());
        System.out.println("Голос: " + myKitten.voice());
    }
}
