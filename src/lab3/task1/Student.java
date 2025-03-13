package lab3.task1;

class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double avMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avMark = averageMark;
    }

    public double getAvMark() {
        return avMark;
    }

    public double getScholarship() {
        if (avMark == 8) {
            return 100;
        } else {
            return 80;
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + group + ")";
    }
}
