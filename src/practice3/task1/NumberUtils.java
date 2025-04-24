package practice3.task1;

public class NumberUtils<T extends Number, U extends Number> {

    public double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    public <A extends Number, B extends Number> boolean[] compareArrays(A[] arr1, B[] arr2) {
        int len = Math.min(arr1.length, arr2.length);
        boolean[] result = new boolean[len];
        for (int i = 0; i < len; i++) {
            result[i] = Double.compare(arr1[i].doubleValue(), arr2[i].doubleValue()) == 0;
        }
        return result;
    }

    public <N extends Number & Comparable<N>> N max(N[] array) {
        if (array == null || array.length == 0) return null;
        N max = array[0];
        for (N n : array) {
            if (n.compareTo(max) > 0) {
                max = n;
            }
        }
        return max;
    }

    public <N extends Number & Comparable<N>> N min(N[] array) {
        if (array == null || array.length == 0) return null;
        N min = array[0];
        for (N n : array) {
            if (n.compareTo(min) < 0) {
                min = n;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        NumberUtils<Integer, Double> utils = new NumberUtils<>();

        // Сумма чисел
        System.out.println("Sum: " + utils.sum(10, 20.5));

        // Поэлементное сравнение массивов
        Integer[] arr1 = {1, 2, 3};
        Double[] arr2 = {1.0, 3.0, 3.0};
        boolean[] comparison = utils.compareArrays(arr1, arr2);
        for (boolean b : comparison) {
            System.out.print(b + " "); // true false true
        }
        System.out.println();

        // Максимум и минимум
        System.out.println("Max: " + utils.max(arr1)); // 3
        System.out.println("Min: " + utils.min(arr2)); // 1.0
    }
}
