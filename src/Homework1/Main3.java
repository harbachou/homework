package com.company;

public class Main3 {

    public static void main(String[] args) {
        int a = -42; //-00101010
        int b = -15; //-00001111
        int m = 2; //00000010
        int s = a << m; //-10101000
        int f = b << m; //-00111100
        int q = a >> m; //-00001011
        int w = b >> m; //-00000100
        int r = a >>> m; //111111111111111111111111110101
        int y = b >>> m; //111111111111111111111111111100
        System.out.println("s = a << m = " + s);
        System.out.println("f = b << m = " + f);
        System.out.println("q = a >> m = " + q);
        System.out.println("w = b >> m = " + w);
        System.out.println("r = a >>> m = " + r);
        System.out.println("y = b >>> m = " +y);
    }
    }

