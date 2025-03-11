package practice_first_lesson.OOP.eleven;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Барсик", 6, 3.5, 25.0);
        Animal animal2 = new Animal("Пух", 2, 1.5, 15.0);
        Animal animal3 = new Animal("Шушик", 4, 2.0, 30.0);

        animal1.displayInfo();
        animal2.displayInfo();
        animal3.displayInfo();

        if (animal1.hasSameName(animal3)) {
            System.out.println(animal1.name + " и " + animal3.name + " имеют одинаковые имена.");
        } else {
            System.out.println(animal1.name + " и " + animal3.name + " имеют разные имена.");
        }

        animal1.compareWithThresholds();
        animal2.compareWithThresholds();
        animal3.compareWithThresholds();
    }
}