package com.company;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        String name = "Вася";
        String name1 = "Анастасия";
        Scanner scan = new Scanner(System.in);
        System.out.println("Имя: ");
        if (scan.hasNext(name)) {
            System.out.println("Привет! ");
            System.out.println("Я тебя так долго ждал ");
        }
        else if (scan.hasNext(name1)) {
            System.out.println("Я тебя так долго ждал ");
        }
        else
            System.out.println ("Добрый день, а вы кто?");

    }
}


