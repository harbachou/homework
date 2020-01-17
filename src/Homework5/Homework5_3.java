package Homework5;
 /*Написать программу которая будет обрабатывать ввод в консоль. Наполнять массив int тем
 что введут из консоли, давать не более трёх ошибочных попыток подряд на ввод через консоль.*/

import java.util.Scanner;

public class Homework5_3 {
    Scanner in = new Scanner(System.in);
    int incorrect = 0;

    public static void main(String[] args) {
        new Homework5_3().getArray(5);
    }

    public int[] getArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = setNumber();
        }
        for (int arr : array) {
            System.out.print(" " + arr);
        }
        return array;
    }
    private int setNumber() {
        Integer element = null;
        try {
            element = Integer.parseInt(in.nextLine());
            incorrect = 0;
            return element;
        } catch (NumberFormatException e) {
            if (incorrect < 2) {
                System.out.println("Ошибка. Осталось попыток: " + (2 - incorrect));
                incorrect++;
                return setNumber();
            } else {
                System.out.println("Это фиаско братан");
                System.exit(0);
            }
        }
        return element;
    }
}

