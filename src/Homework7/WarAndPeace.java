package Homework7;
/* Найти в книге "Война и мир" при помощи обычного поиска по строке и при помощи регуляных выражений.
3. Реализацию поиска сделать при помощи классов и интерфейсов. Вывести информацию как часто встречаются строки
"война", "и" (как союз), "мир". Дать возможность через аргументы программы выбрать какое слово будем искать в тексте
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WarAndPeace {
    public static void main(String[] args) {
        String str, word;
        String[] words = null;

        String strs = "";

        int k = 0;

        boolean fl = false;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите слово: ");

        word = in.nextLine();

        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream
                    ("C:\\Users\\user\\IdeaProjects\\HomeWork2\\src\\Homework7\\Война и мир.txt"),
                    "cp1251"));

            while ((str = r.readLine()) != null)

                strs = strs + str + ' ';

            words = strs.split("[\\s,-;.]+");

            for (int i = 0; i < words.length; i++)

                if (word.equalsIgnoreCase(words[i])) {
                    k++;
                    fl = true;
                }

            if (fl != true)

                System.out.println("В тексте нет этого слова");

            else

                System.out.println("Количество введенного слова = " + k);

            r.close();

        } catch (IOException ex) {
            System.out.println("Ошибка: " + ex);
        }
    }
}
