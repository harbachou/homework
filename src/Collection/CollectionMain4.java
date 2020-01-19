package Collection;

import java.util.*;

public class CollectionMain4 {
    public static void main (String [] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("Количество элементов" + queue.size());

        queue.add("elements 1");
        queue.add("elements 2");
        queue.add("elements 3");

        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println(("Количество элементов после итераций ") + queue.size());

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(queue.element());
        }
        System.out.println("Количество элементов после итерации ");

         for (int i = 0; i < 100; i++){
             System.out.println(queue.poll());
         }

    }
}
