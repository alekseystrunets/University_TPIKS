package practice.task1;

class Cat extends Animals {
    private int miceCaught;

    public Cat(double weight, int age, String name) {
        super(weight, age, name);
        this.miceCaught = 0;
    }

    public void setMiceCaught(int miceCaught) {
        this.miceCaught = miceCaught;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Количество пойманных мышей: " + miceCaught;
    }
}
