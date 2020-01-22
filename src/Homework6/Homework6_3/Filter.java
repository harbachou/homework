package Homework6.Homework6_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Filter {

    public void NumbersOff(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj instanceof Number) {
                iterator.remove();
            }
        }
    }
}


