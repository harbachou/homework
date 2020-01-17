package Homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Класс который будет наследовать предыдущий класс и перекрывать написанный вами метод
и добавлять туда свой чекед эксепшн (новый написанный также вами)
 */
public class Homework5_2_2 extends Homework5_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\Desktop\\input.txt");
        try {
            FileReader fileReader = new FileReader(file);
            char[] charArray = new char[0];
            fileReader.read(charArray);
            for (char character : charArray) {
                System.out.println(character);
            }
            fileReader.close();
        } catch (IOException ex) {
            System.out.println("Файл по указанному пути не найден");
        }
    }
}





