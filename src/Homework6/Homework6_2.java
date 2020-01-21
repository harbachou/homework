package Homework6;

/*Написать код, который удаляет элементы из списка во время цикла по нему*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Homework6_2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[2];
            args[0] = "10";
            args[1] = "100";
        }
        int itemsCount = Integer.parseInt(args[0]);
        int maxRandomValue = Integer.parseInt(args[1]);

        List list = new ArrayList<>();
        Random myRandom = new Random();
        for (int i = 0; i < itemsCount; i++) {
            list.add(myRandom.nextInt(maxRandomValue));
        }
        System.out.println("Добавлены значения в ArrayList: " + list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();

        }
        System.out.println("Результат после удаления: " + list.size());
    }
}
