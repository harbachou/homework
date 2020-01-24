package Homework7;
/* Найти в книге "Война и мир" при помощи обычного поиска по строке и при помощи регуляных выражений.
3. Реализацию поиска сделать при помощи классов и интерфейсов. Вывести информацию как часто встречаются строки
"война", "и" (как союз), "мир". Дать возможность через аргументы программы выбрать какое слово будем искать в тексте
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class Homework7_2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\Война и мир.txt");
        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println("Количество слов в файле: " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



