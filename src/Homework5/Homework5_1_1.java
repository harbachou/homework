package Homework5;

public class Homework5_1_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
        }
        catch (Exception err) {
            System.out.println("На ноль делить нельзя");
        }
            finally {
            System.out.println("Продолжаем работать");
        }
        }
    }

