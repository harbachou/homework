/*
package s.exception;

import s.exception.api.MyCheckedException;

public class ExсeptionTest {
    public static void main(String[] args) {
        int i = method1(0);
        System.out.println("Привет, как дела? " + i);
    }

    public static int method1(int data) {
        try {
            int result = method2(data);
            System.out.println("Мы получили " + result);
            return result;
        } catch (Exception err) {
            System.out.println("Возникла ошибка " + err.getMessage());
        }
        return -1;
    }

    public static int method2(int data) {
        try {
        if(data == 1) {
            return method3(data);
        } else {
            return method3(data);
        }
        catch (MyCheckedException ex){

            throw new RuntimeException(ex);
            }
        }

    public static int method3(int data) throws MyCheckedException() {
        if (data == 0) {
                throw new MyCheckedException("Переданные данные не могут быть 0");
        }
            return 999;
        }
    }


    private static void method3() {
    }

    private static void method3() {
    }*/
