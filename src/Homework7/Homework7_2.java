package Homework7;
/* Определяем колличество слов в файле "Война и мир"
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class Homework7_2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\IdeaProjects\\HomeWork2\\src\\Homework7\\Война и мир.txt");
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



