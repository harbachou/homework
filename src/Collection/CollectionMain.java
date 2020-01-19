package Collection;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        List<Passport> collection = new ArrayList<>();
        Passport passport = new Passport();
        passport.setId("MP...");
        passport.setEffectiveAt(new Date());
        passport.setFio("Andrey Gorbachev");

        Passport passport2 = new Passport();
        passport2.setId("MP...");
        passport2.setEffectiveAt(new Date());
        passport2.setFio("Andrey Gorbachev");

        collection.add(passport);
        collection.add(passport2);

        for (Passport passport1 : collection) {
            System.out.println(passport);
        }
        collection.remove(passport);
        System.out.println("after remove");
        for (Passport passport1 : collection) {
            System.out.println(passport);
        }
        System.out.println("test");

        for (int i = 0; i < collection.size(); i++) {
            System.out.println("index" + i + " " + collection.get(i));
        }
    }
}
