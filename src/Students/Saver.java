package Students;

import java.io.*;
import java.util.List;

public class Saver {
    public static void Save (String file1, List<Students> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(file1))){
            oos.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
