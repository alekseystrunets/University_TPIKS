package lab2.task6;

public class StringMethod {

    public static void performStringOperations(String str) {
        // 1. Печатаем последний символ строки
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 2. Проверяем, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Заканчивается ли строка подстрокой \"!!!\": " + endsWithExclamation);

        // 3. Проверяем, начинается ли строка подстрокой "I like"
        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Начинается ли строка подстрокой \"I like\": " + startsWithILike);

        // 4. Проверяем, содержит ли строка подстроку "Java"
        boolean containsJava = str.contains("Java");
        System.out.println("Содержит ли строка подстроку \"Java\": " + containsJava);

        // 5. Находим позицию подстроки "Java"
        int positionOfJava = str.indexOf("Java");
        System.out.println("Позиция подстроки \"Java\": " + positionOfJava);

        // 6. Заменяем все символы "а" на "о"
        String replacedString = str.replace("a", "о");
        System.out.println("Строка после замены \"a\" на \"о\": " + replacedString);

        // 7. Преобразуем строку к верхнему регистру
        String upperCaseString = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // 8. Преобразуем строку к нижнему регистру
        String lowerCaseString = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // 9. Вырезаем строку "Java"
        String substringJava = str.substring(positionOfJava, positionOfJava + "Java".length());
        System.out.println("Вырезанная подстрока \"Java\": " + substringJava);
    }
}
