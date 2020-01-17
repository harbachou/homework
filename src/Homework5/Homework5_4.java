package Homework5;
/*Полученный массив через консоль преобразовать в коллекцию и
отсортировать данную коллекцию по возрастанию.
 */
import java.util.Arrays;
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
            System.out.println("\nОтсортированный массив:");
            Arrays.sort(array);
            for (int i = 0; i< array.length; i++){
                System.out.print(" " + array[i]);
            }
        }
    }

