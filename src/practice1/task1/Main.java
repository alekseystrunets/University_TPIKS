package practice1.task1;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat(4.5, 3, "Барсик");
        System.out.println(myCat.displayInfo());

        myCat.setMiceCaught(5);
        System.out.println(myCat.displayInfo());

        myCat.setWeight(5.0);
        myCat.setAge(4);
        System.out.println(myCat.displayInfo());
    }
}
