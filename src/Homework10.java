import java.util.Arrays;

public class Homework10 {

    public static void main(String[] args) {
        int [] array = new int [] {15, 45, 70, 14, 24, 55, 85, 13};
        boolean Sort = false;
        int change;
        while (!Sort) {
            Sort = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    change = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = change;
                    Sort = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}





