package com.company;

public class Main2 {

    public static void main(String[] args) {
        int a = 10; //00101010
        int b = 3; //00001111
        int m = 3; //00000011
        int s = a << m; //101010000
        int f = b << m; //01111000
        int q = a >> m; //00000101
        int w = b >> m; //00000001
        int r = a >>> m; //00000101
        int y = b >>> m; //00000001
        System.out.println("s = a << m = " + s);
        System.out.println("f = b << m = " + f);
        System.out.println("q = a >> b = " + q);
        System.out.println("w = b >> m = " + w);
        System.out.println("r = a >>> m = " + r);
        System.out.println("y = b >>> m = " +y);
    }
    }

