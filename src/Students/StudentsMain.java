package Students;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StudentsMain {
    public static void main(String[] args) {
        List<Students> studentsList = new LinkedList<>();
        for (int i=0; i<100; i++) {
            studentsList.add(new Students());
        }
        File file = new File ("Список студентов.txt");
        if (file.exists()) {
            List<Students> list = Loader.load("Список студентов.txt");
            select(list);
        } else {
            List<Students> list = null;
            list = Stream.generate(()-> new Students(Generate.name(), Generate.surname())).limit(100)
                    .collect(toList());
            Saver.Save("Список студентов.txt", list);
            select(list);
        }
    }

    public static void select (List<Students>list) {
        List<Students> list1 = null;
        List<Students> list2 = null;
        list1 = list.stream().filter(Objects::nonNull).filter(x-> x.getRating()<7).collect(toList());
        list2 = list.stream().filter(Objects::nonNull).sorted(Comparator.comparing(Students::getRating).reversed())
                .collect(toList());
        Saver.Save("Sort.txt", list2);
        StringList.listToString("Students.txt", list2);
        Saver.Save("WithOut.txt", notSertificate ("Sort.txt"));
        StringList.listToString("StudentsWithOut.txt", notSertificate ("Sort.txt"));
    }
    public static List<Students> notSertificate (String file){
        List<Students> listS = Loader.load(file);
        Random random = new Random();
        for (int i=0; i<3; i++){
            int num = random.nextInt(listS.size());
            listS.remove(num);
        }
        return listS;
    }
}
