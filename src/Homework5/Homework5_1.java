package Homework5;

public class Homework5_1 {
    int a = 5;
    int b = 0;

    public static void main(String[] args) {
        Homework5_1 exception = new Homework5_1();
        exception.exception1();
        exception.exception2();
        exception.exception3();
    }

    public void exception1() {
        try {
            System.out.println(a / b);
        } catch (Exception err) {
            System.out.println("На ноль делить нельзя");
        }
    }

    public void exception2() {
        try {
            System.out.println(a / b);
        } catch (Exception err) {
            System.out.println("На ноль делить нельзя");
        } finally {
            System.out.println("Продолжаем работать 1");
        }
    }

    public void exception3() {
        try {
            System.out.println(a / b);
        } finally {
            System.out.println("Продолжаем работать 2");
        }
    }
}




