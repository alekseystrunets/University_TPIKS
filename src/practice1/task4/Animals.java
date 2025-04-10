package practice1.task4;

class Animals {
    private double weight;
    private int age;
    private String name;

    public Animals(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String displayInfo() {
        return "Имя: " + name + ", Возраст: " + age + " лет, Вес: " + weight + " кг";
    }
}
