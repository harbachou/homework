package Homework5;
/*Полученный массив через консоль преобразовать в коллекцию и
отсортировать данную коллекцию по возрастанию.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Homework5_4 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int array[] = new int[5];
            System.out.println("Введите числа ");
            for (int i = 0; i < 5; i++) {
                array[i] = input.nextInt();
            }
            System.out.print("Полученный массив: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(" " + array[i]);
            }

        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        for(int j=0;j<array.length; j++){
            arrayList.add(array[j]);
        }
        Collections.sort (arrayList);
        System.out.print("\nСортированная коллекция: ");

        System.out.println(arrayList);
            }
        }


