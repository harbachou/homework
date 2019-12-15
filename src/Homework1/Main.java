package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111
        int c = a | b; //00101111
        int d = a & b; //00001010
        int e = a ^ b; //00100101
        int f = ~ a; //-00101011
        int g = ~ b; //-00010000
        System.out.println("a | b = " + c);
        System.out.println("a & b = " + d);
        System.out.println("a ^ b = " + e);
        System.out.println("~ a = " + f);
        System.out.println("~ b = " + g);
        int x = -42; //-00101010
        int y = -15; //-00001111
        int r = x | y; //-00001001
        int t = x & y; //-00110000
        int u = x ^ y; //00100111
        int i = ~ x; //00101001
        int p = ~ y; //00001110
        System.out.println("x | y = " + r);
        System.out.println("x & y = " + t);
        System.out.println("x ^ y = " + u);
        System.out.println("~ x = " + i);
        System.out.println("~ y = " + p);
    }
    }

