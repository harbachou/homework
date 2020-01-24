package Homework7;
/*Выполнить Поиск в строке "Я люблю JAVA" при помощи регулярного выражения (h*, h+, h?).
Объяснить в комментариях к коду почему работает и не работает все три примера для метода matches
 */

public class Homework7_1_matches {
    public static void main(String[] args) {
        String text = new String ("Я люблю JAVA");

        System.out.println(text.matches("h*"));
        System.out.println(text.matches("h+"));
        System.out.println(text.matches("h?"));
    }
}
// Все результаты false т.к. проверяется вся строка на соответствие
