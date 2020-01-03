package Calc;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        String exit ="no";
        int count = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число a");
            double a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Введите оператор");
            String operator = scanner.nextLine();
            System.out.println("Введите число b");
            double b = scanner.nextDouble();

            Calc calculator = new Calc();
            double result = calculator.calculate(a, b, operator);
            System.out.println(a +  operator + b + " = " + result);
            System.out.println("Колличество выполненных операций = " + count);
            count+=1;
            if (count > 5){
                System.out.println("Ваш приз: АВТОМОБИЛЬ!!!");
            }
            System.out.println("Выйти из программы: no/yes");
            exit=scanner.next();
        }
        while (!exit.equals("yes"));
    }
}

