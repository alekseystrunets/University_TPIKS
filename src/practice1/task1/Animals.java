package practice1.task1;

class Animals {
    private double weight;
    private int age;
    private String name;

    public Animals(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
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
