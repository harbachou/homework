package Homework3;
/*Написать класс в котором будут сожержаться все методы сортировок которые были заданы ранее.
Начать их использовать в вашем коде.
 */
import java.util.Scanner;
public class Homework3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер массива");
        int size = in.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите значение " + (i + 1) + " массива");
            mass[i] = in.nextInt();
        }
        System.out.println("\n Введенный массив");
        for (int value : mass) {
            System.out.print(+value + " ; ");
        }
        selectionSort(mass);
        System.out.println("\n Отсортированный массив");
        for (int value : mass) {
            System.out.print(+value + " ; ");
        }
    }
    //Сортировка выбором
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }
    //Сортировка пузырьком
            public static int[] bubbleSort(int[] arr){
                for (int i = arr.length - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int tmp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = tmp;
                        }
                    }
                }
                return arr;
            }
        }


