package Homework3;

import java.util.Scanner;

/*Сравнить две строки: "Мама мыла раму" и ввести эту же строку через консоль.
При помощи оператора == и получить результаты сравнения true (да это возможно, как?)
 */
public class Homework3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = ("Мама мыла раму");
        String str2 = in.nextLine();
        System.out.println(str.intern() == str2.intern());
    }
}
/* Использование метода intern гарантирует что введеная строка будет в пуле.
Т.к. строки в пуле совпадают нам выдает значение true
 */