package practice1.task5;

class Kitten extends Cat {
    private String feedingTime;

    public Kitten(double weight, int age, String name, String feedingTime) {
        super(weight, age, name);
        this.feedingTime = feedingTime;
    }

    public Kitten(Kitten kitten) {
        super(kitten);
        this.feedingTime = kitten.feedingTime;
    }

    public String getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(String feedingTime) {
        this.feedingTime = feedingTime;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Время кормления: " + feedingTime;
    }
}
