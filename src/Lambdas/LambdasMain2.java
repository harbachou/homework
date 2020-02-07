package Lambdas;

public class LambdasMain2 {
    public static void main(String[] args) {
        FuncInterface2 fune = (b, c) -> b + c;

        System.out.println(fune.plus(3, 8));
    }
}
