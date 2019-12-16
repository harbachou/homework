package Homework3;
/*Написать класс в котором будут сожержаться все методы сортировок которые были заданы ранее.
Начать их использовать в вашем коде.
 */
public class Homework3_1 {
    public static void main(String[] args) {
        //Сортировка выбором
    }public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
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
    }
}
