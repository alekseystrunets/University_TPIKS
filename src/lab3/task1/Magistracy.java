package lab3.task1;

class Magistracy extends Student {
    public Magistracy(String firstName, String lastName, String group, double avMark) {
        super(firstName, lastName, group, avMark);
    }

    @Override
    public double getScholarship() {
        if (getAvMark() == 8) {
            return 200;
        } else {
            return 180;
        }
    }
}
