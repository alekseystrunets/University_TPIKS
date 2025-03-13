package practice_first_lesson.OOP.eleven;

class Animal {
    // Поля класса
    String name;
    int age;   // возраст
    double weight; // вес
    double height; // рост

    public static final int AGE = 5;
    public static final double WEIGHT = 2;
    public static final double HEIGHT = 20;

    public Animal() {
        this.name = "Ничего";
        this.age = 0;
        this.weight = 0.0;
        this.height = 0.0;
    }

    public Animal(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет, Вес: " + weight + " кг, Рост: " + height + " см");
    }

    boolean hasSameName(Animal other) {
        return this.name.equals(other.name);
    }

    void compareWithThresholds() {
        if (age > AGE) {
            System.out.println(name + " старше " + AGE + " лет");
        } else {
            System.out.println(name + " не старше " + AGE + " лет");
        }

        if (weight < WEIGHT) {
            System.out.println(name + " легче " + WEIGHT + " кг");
        } else {
            System.out.println(name + " не легче " + WEIGHT + " кг");
        }

        if (height < HEIGHT) {
            System.out.println(name + " ниже " + HEIGHT + " см");
        } else {
            System.out.println(name + " не ниже " + HEIGHT + " см");
        }
    }
}
