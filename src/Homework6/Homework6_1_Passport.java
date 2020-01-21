package Homework6;

import java.util.*;

/*Написать пример, в котором рандомно генерируется 1 000 000 паспортов (чем больше тем лучше, может не хватить памяти)
и сохраняются в ArrayList, LinkedList. При помощи system.currenttimemillis() замерить добавление элементов в лист,
замерить скорость удаление элементов из листа и вывести значение.
 */
public class Homework6_1_Passport {
    public static void main (String [] args){
        List<PassportNew> arrayListPassport = new ArrayList<>();
        List<PassportNew> linkedListPassport = new LinkedList<>();
        long start, finish, startDelete, finishDelete, start2, finish2, startDelete2, finishDelete2;
        Random random = new Random();


        start = System.currentTimeMillis();
        for(int i=0; i<1_000_000; i++){
        arrayListPassport.add(new PassportNew("" + random.nextInt(1_000_000),
                new Date(), "Gorbachev A.N."));}
        finish = System.currentTimeMillis();
        System.out.println("Размер array до удаления " + arrayListPassport.size());

        startDelete = System.currentTimeMillis();
        for (int i=999999; i>=0; i--){
            arrayListPassport.remove(i);
        }
        finishDelete = System.currentTimeMillis();
        System.out.println("Размер array после удаления " + linkedListPassport.size());

        start2 = System.currentTimeMillis();
        for(int i=0; i<1_000_000; i++){
            linkedListPassport.add(new PassportNew("" + random.nextInt(1_000_000),
                    new Date(), "Gorbachev A.N."));}
        finish2 = System.currentTimeMillis();
        System.out.println("Размер list до удаления " + linkedListPassport.size());

        startDelete2 = System.currentTimeMillis();
        for (int i=999999; i>=0; i--){
            linkedListPassport.remove(i);
        }
        finishDelete2 = System.currentTimeMillis();
        System.out.println("Размер list после удаления " + linkedListPassport.size());

        System.out.println("Время добавления array " + (finish - start));
        System.out.println("Время добавления list " + (finish2 - start2));
        System.out.println("Время удаления array " + (finishDelete - startDelete));
        System.out.println("Время удаления list " + (finishDelete2 - startDelete2));

        }

    }

