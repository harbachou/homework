package Homework3;
/*Сравнить две строки: "Мама мыла раму" и "Мама" + " мыла " + "раму" при помощи
оператора == и получить результаты сравнения true (да это возможно, но почему?)
 */
public class Homework3_2 {
    public static void main(String[] args) {
        String str = ("Мама мыла раму");
        String str2 = ("Мама "+"мыла "+"раму");
        System.out.println(str == str2);
    }
}
