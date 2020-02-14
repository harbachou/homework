package Students;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class StringList {
    public static void listToString(String file, List<Students>list) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileOutputStream(file));
            for (Students ls: list)
                writer.println(ls.getName()+" "+ls.getSurname()+" "+ls.getRating());
            writer.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
