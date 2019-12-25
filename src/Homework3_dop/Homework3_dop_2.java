package Homework3_dop;

public class Homework3_dop_2 {
    public static void main(String args []){
        final int min = 100;
        final int max = 999;
        int first;
        int second;
        int third;
        int value_max;
        int value = (int) (min + Math.random() * (max - min)) ;
        if(value > min && value < max) {
            first = (int) Math.floor(value / 100);
            second = (int) Math.floor((value - first * 100) / 10);
            third = (int) Math.floor(value - first * 100 - second * 10);
            System.out.println("Трехзначное число = "  + value);
            if(first > second){
                if (first>third)
                    value_max=first;
                else
                    value_max=third;
            }
            else{
                if (second>third)
                    value_max=second;
                else
                    value_max=third;
            }
            System.out.println("Первое число = "  + first);
            System.out.println("Второе число = "  + second);
            System.out.println("Третье число = "  + third);
            System.out.println("Максимальное число = "  + value_max);

        }
    }
}

