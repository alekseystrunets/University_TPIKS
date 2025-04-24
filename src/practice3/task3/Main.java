package practice3.task3;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> numberClassifier =
                number -> number > 0 ? "+"
                        : number < 0 ? "-"
                        : "0";

        System.out.println(numberClassifier.apply(5));
        System.out.println(numberClassifier.apply(-3));
        System.out.println(numberClassifier.apply(0));
    }
}
