package practice_first_lesson.OOP.fourth;

class Student {
    int numberCourse;
    String nameStudent;

    void info() {
        System.out.println("Имя студента: " + nameStudent + ", Номер курса: " + numberCourse);
    }

    double calculateAv(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}
