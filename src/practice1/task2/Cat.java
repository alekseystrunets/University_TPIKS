package practice1.task2;

class Cat extends Animals {
    private int miceCaught;

    public Cat(double weight, int age, String name) {
        super(weight, age, name);
        this.miceCaught = 0;
    }

    public int getMiceCaught() {
        return miceCaught;
    }

    public void setMiceCaught(int miceCaught) {
        this.miceCaught = miceCaught;
    }


    public String displayInfo() {
        return super.displayInfo() + ", Количество пойманных мышей: " + miceCaught;
    }
}
