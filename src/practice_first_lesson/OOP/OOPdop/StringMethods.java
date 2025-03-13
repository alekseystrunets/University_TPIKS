package practice_first_lesson.OOP.OOPdop;

import java.util.*;
import java.util.regex.*;

public class StringMethods {

    public static void sortByCount(String[] strings) {
        int n = strings.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int wordCount1 = countWords(strings[j]);
                int wordCount2 = countWords(strings[j + 1]);
                if (wordCount1 > wordCount2) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
    }

    // Метод для подсчета слов в строке
    private static int countWords(String string) {
        if (string.trim().isEmpty()) {
            return 0;
        }
        return string.trim().split("\\s+").length;
    }

    // длины всех строк
    public static void printStringLengths(String[] strings) {
        System.out.println("Длины строк:");
        for (String s : strings) {
            System.out.println(s.length());
        }
    }

    // вывод подстроки из i по j
    public static void printSubStr(String[] strings, int i, int j) {
        System.out.println("Подстрока с " + i + " по " + j + ":");
        for (int idx = i; idx <= j && idx < strings.length; idx++) {
            System.out.println(strings[idx]);
        }
    }

    // нахождение номера строки с максимальной цифрой
    public static int indexOfMax(String[] strings) {
        int maxDigitSum = -1;
        int index = -1;

        for (int i = 0; i < strings.length; i++) {
            int digitSum = sumDigits(strings[i]);
            if (digitSum > maxDigitSum) {
                maxDigitSum = digitSum;
                index = i;
            }
        }
        return index;
    }

    // удаление всех заглавных букв из i-ой строки
    public static void removeUppercaseFromIth(String[] strings, int i) {
        strings[i] = strings[i].replaceAll("[A-Z]", "");
    }

    // удаление символов, которые не буквы и не цифры из i-ой строки
    public static void removeNonAlphanumericFromIth(String[] strings, int i) {
        strings[i] = strings[i].replaceAll("[^a-zA-Z0-9]", "");
    }

    // вывод всех слов из i-ой строки, содержащих только цифры
    public static void printDigitsFromIth(String[] strings, int i) {
        String[] words = strings[i].split("\\s+");
        System.out.println("Слова, содержащие только цифры:");
        for (String word : words) {
            if (word.matches("\\d+")) {
                System.out.println(word);
            }
        }
    }

    // вычисление суммы всех цифр i-ой строки
    public static int sumDigits(String str) {
        return str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }

    // вывод всех слов, содержащих только прописные буквы
    public static void printUppercaseWords(String[] strings) {
        System.out.println("Слова, содержащие только заглавные буквы:");
        for (String s : strings) {
            String[] words = s.split("\\s+");
            for (String word : words) {
                if (word.chars().allMatch(Character::isUpperCase)) {
                    System.out.println(word);
                }
            }
        }
    }

    // вывод всех чисел из строк
    public static void printAll(String[] strings) {
        System.out.println("Все числа из строк:");
        for (String s : strings) {
            Matcher matcher = Pattern.compile("\\d+").matcher(s);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }

    // удаление части строки, заключенной между двумя символами
    public static void removeBetweenChars(String[] strings, int index, char startChar, char endChar) {
        if (index >= 0 && index < strings.length) {
            String str = strings[index];
            int startIndex = str.indexOf(startChar);
            int endIndex = str.indexOf(endChar, startIndex + 1);
            if (startIndex != -1 && endIndex != -1) {
                strings[index] = str.substring(0, startIndex) + str.substring(endIndex + 1);
            }
        }
    }

    // определение количества одинаковых строк
    public static void countSameStrings(String[] strings) {
        Map<String, Integer> stringCount = new HashMap<>();
        for (String s : strings) {
            stringCount.put(s, stringCount.getOrDefault(s, 0) + 1);
        }
        System.out.println("Количество одинаковых строк:");
        for (Map.Entry<String, Integer> entry : stringCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // определение количества одинаковых слов
    public static void countSameWords(String[] strings) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String s : strings) {
            String[] words = s.split("\\s+");
            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Количество одинаковых слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // объединение строк с i по j
    public static String concatenateStrings(String[] strings, int i, int j) {
        StringBuilder result = new StringBuilder();
        for (int idx = i; idx <= j && idx < strings.length; idx++) {
            result.append(strings[idx]).append(" ");
        }
        return result.toString().trim();
    }

    // Метод для преобразования i-ой строки, чтобы все слова начинались с заглавной буквы
    public static void capitalizeWordsInIth(String[] strings, int i) {
        String[] words = strings[i].split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }
        strings[i] = capitalized.toString().trim();
    }

    // внесение изменения в i-ую строку
    public static void updateIthString(String[] strings, int i, String newContent) {
        if (i >= 0 && i < strings.length) {
            strings[i] = newContent;
        }
    }

    public static void main(String[] args) {
        String[] strings = {
                "Hello 123",
                "Java 43",
                "Sample text 789",
                "Hello World!",
                "TESTING 1"
        };

        // Сортировка строк по количеству слов
        sortByCount(strings);
        System.out.println("Строки после сортировки по количеству слов:");
        System.out.println(Arrays.toString(strings));

        printStringLengths(strings);

        // Вывод подстроки с 1 по 3
        printSubStr(strings, 1, 3);

        // Вывод номера строки с максимальной цифрой
        int maxDigitIndex = indexOfMax(strings);
        System.out.println("Индекс строки с максимальной суммой цифр: " + maxDigitIndex);

        // Удаление заглавных букв из 4-ой строки
        removeUppercaseFromIth(strings, 4);
        System.out.println("После удаления заглавных букв из 4-й строки: " + strings[4]);

        // Удаление символов, не являющихся буквами или цифрами из 0-ой строки
        removeNonAlphanumericFromIth(strings, 0);
        System.out.println("После удаления не алфавитных символов из 0-й строки: " + strings[0]);

        // Вывод всех слов с цифрами из 1-ой строки
        printDigitsFromIth(strings, 1);

        // Сумма всех цифр из 2-ой строки
        int digitSum = sumDigits(strings[2]);
        System.out.println("Сумма всех цифр в 2-ой строке: " + digitSum);

        // Вывод всех слов, содержащих только заглавные буквы
        printUppercaseWords(strings);

        // Вывод всех чисел из строк
        printAll(strings);

        // Удаление части строки между двумя символами (например, между 'a' и 'g')
        removeBetweenChars(strings, 1, 'a', 'g');
        System.out.println("После удаления части строки между 'a' и 'g' в 1-й строке: " + strings[1]);

        // Количество одинаковых строк
        countSameStrings(strings);

        // Количество одинаковых слов
        countSameWords(strings);

        // Объединение строк с 2 по 4
        String concatenated = concatenateStrings(strings, 2, 4);
        System.out.println("Объединение строк с 2 по 4: " + concatenated);
        // Преобразование 0-й строки, чтобы все слова начинались с заглавной буквы
        capitalizeWordsInIth(strings, 0);
        System.out.println("После преобразования 0-й строки: " + strings[0]);

        // Изменение 2-й строки на новое содержание
        updateIthString(strings, 2, "New content for the third string");
        System.out.println("После изменения 2-й строки: " + strings[2]);
    }
}
