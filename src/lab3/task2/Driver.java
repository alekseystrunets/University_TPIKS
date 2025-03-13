package lab3.task2;

public class Driver extends Person {
    private int experience;

    public Driver(String fullName, int experience) {
        super(fullName);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Driver: " + getFullName() + ", Experience: " + experience + " years";
    }
}
