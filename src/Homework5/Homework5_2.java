package Homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Написать свой класс котором будет:
 2.1 метод который принимает 1 параметр, его обрабатывает и выбрасывать
 чекед эксепшн (который вы должны написать сами) при условиях заданных вами
 */
public class Homework5_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\Desktop\\input2.txt");
        try {
            FileReader fileReader = new FileReader(file);
            char[] charArray = new char[0];
            fileReader.read(charArray);
            for (char character : charArray) {
                System.out.println(character);
            }
            fileReader.close();
        }
        catch (IOException ex) {
            System.out.println("Файл по указанному пути не найден");
        }
    }
}
