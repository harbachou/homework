package Homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Выполнить Поиск в строке "Я люблю JAVA" при помощи регулярного выражения (h*, h+, h?).
Объяснить в комментариях к коду почему работает и не работает все три примера для метода find
 */
public class Homework7_1_find {
    public static void main(String[] args) {
        String text = new String("Я люблю JAVA");

        Pattern pattern = Pattern.compile("h*");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.find());        //true * "0 или больше"  "h" не встречается в строке

        Pattern pattern1 = Pattern.compile("h+");
        Matcher matcher1 = pattern1.matcher(text);
        System.out.println(matcher1.find());       //false "h" должна быть "1 или больше", а у нас ее нет

        Pattern pattern2 = Pattern.compile("h?");
        Matcher matcher2 = pattern2.matcher(text);
        System.out.println(matcher2.find());      //true т.к. "h" должна быть "0 или 1" раз
    }
}
