package practice.task6;

class Dog extends Animals {
    private String breed;

    public Dog(double weight, int age, String name, String breed) {
        super(weight, age, name);
        this.breed = breed;
    }

    public Dog(Dog dog) {
        super(dog);
        this.breed = dog.breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String voice() {
        return "Гав";
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Порода: " + breed;
    }
}
