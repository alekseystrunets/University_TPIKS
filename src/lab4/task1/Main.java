package lab4.task1;

import java.util.LinkedList;
import java.util.TreeSet;

import static lab4.task1.Manager.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 1));
        students.add(new Student("David", 3));
        students.add(new Student("Eve", 2));
        students.add(new Student("Frank", 1));
        students.add(new Student("Grace", 3));

        System.out.println("Студенты на курсе 1:");
        printStudents(students, 1);

        LinkedList<Student> set1 = new LinkedList<>();
        set1.add(new Student("Alice", 1));
        set1.add(new Student("Bob", 2));

        LinkedList<Student> set2 = new LinkedList<>();
        set2.add(new Student("Charlie", 1));
        set2.add(new Student("David", 3));

        System.out.println("Объединение двух множеств:");
        LinkedList<Student> unionSet = union(set1, set2);
        printSet(unionSet);

        System.out.println("Пересечение двух множеств:");
        LinkedList<Student> intersectSet = intersect(set1, set2);
        printSet(intersectSet);

        // Сортировка студентов по номеру курса с помощью TreeSet
        TreeSet<Student> studentTreeSet = new TreeSet<>(students);
        System.out.println("Студенты, отсортированные по номеру курса:");
        for (Student student : studentTreeSet) {
            System.out.println(student);
        }
    }
}
