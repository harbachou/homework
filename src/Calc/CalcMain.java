package Calc;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a и b");
        double a = sc.nextInt();
        double b = sc.nextInt();
        //String operation;
        //Scanner op = new Scanner(System.in);
        //String operation = op.next();

        Calc calc = new Calc();
        System.out.println("Сумма: " + calc.sum(a, b));
        System.out.println("Разность: " + calc.subtraction(a, b));
        System.out.println("Умножение: " + calc.multiplication(a, b));
        System.out.println("Деление: " + calc.division(a, b));
    }
}

