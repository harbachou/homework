package Students;

import java.util.Random;

public class Generate {

    public static String name() {
        Random random = new Random();
        String letters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        StringBuilder strBuilder = new StringBuilder();
        for (int i=0; i<5; i++ ){
            strBuilder.append(letters.charAt(random.nextInt(letters.length())));
        }
        return strBuilder.toString();
    }

    public static String surname() {
        Random random = new Random();
        String letters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        StringBuilder strBuilder = new StringBuilder();
        for (int i=0; i<5; i++ ){
            strBuilder.append(letters.charAt(random.nextInt(letters.length())));
        }
        return strBuilder.toString();
    }
}
