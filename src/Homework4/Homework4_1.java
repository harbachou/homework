package Homework4;

public class Homework4_1 {
    public static void main(String[] args) {
        /*Country country;
        country = Country.valueOf("Belarus");
        System.out.println(country);*/
        for (Country c : Country.values()) {
            System.out.println(c);
        }
    }
}
