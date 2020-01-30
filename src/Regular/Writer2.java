package Regular;

import java.io.*;

public class Writer2 {
    public static void main(String[] args) {
        try (OutputStream stream = new FileOutputStream("file_text2.txt")) {
            PrintWriter writer = new PrintWriter("file_text2.txt");
            writer.println("Привет, запись в файл");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
