package lab4.task4;

class Horse extends Animal {
    private static final long serialVersionUID = 1L;

    private String breed;

    public Horse(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
