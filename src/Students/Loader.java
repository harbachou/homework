package Students;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Loader {
    public static List<Students> load(String file1) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file1))) {
            return (List<Students>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
