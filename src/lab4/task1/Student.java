package lab4.task1;

class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.course, other.course);
    }

    @Override
    public String toString() {
        return name;
    }
}

