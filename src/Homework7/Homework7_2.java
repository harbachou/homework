//package Homework7;
///* Найти в книге "Война и мир" при помощи обычного поиска по строке и при помощи регуляных выражений.
//3. Реализацию поиска сделать при помощи классов и интерфейсов. Вывести информацию как часто встречаются строки
//"война", "и" (как союз), "мир". Дать возможность через аргументы программы выбрать какое слово будем искать в тексте
// */
//
//import java.io.File;
//import java.util.Scanner;
//import java.lang.String;
//
//public class Homework7_2 {
//    public static void main(String[] args) {
//        File file = new File("C:\\Users\\user\\Desktop\\Война и мир.txt");
//        Scanner sc = new Scanner(System.in);
//        String s = "Дано текст и определенное  слово. Посчитать сколько раз заданное слово встречается в тексте.";
//        String s1 = s.replace(".", "").replace("!", "").replace("?",
//                "").toLowerCase();
//        String[] sArr = s1.split(" ");
//        System.out.println("Введите слово для поиска: ");
//        String word = sc.nextLine();
//        int count = 0;
//        for (int i = 0; i < sArr.length; i++) {
//            if (sArr.contains(word)) count++;
//        }
//        System.out.println("'" + word + "' повторяется " + count + " раз");
//    }
//
//
