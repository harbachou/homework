package Lambdas;

public class LambdasMain {
    public static void main (String [] args){
        AnonInterface anon = new AnonInterface() {
            @Override
            public void tukTuk() {
                System.out.println("Стучу в дверь");
            }

            @Override
            public String getName() {
                return "Меня зовут Андрей";
            }
        };

        FuncInterface realisation = () -> 2;

        System.out.println(realisation.getValue());

        anon.tukTuk();
        System.out.println(anon.getName());

    }
}
