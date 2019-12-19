package Homework3_dop;
import java.util.Random;
public class Homework3_dop_1 {
        public static void main(String[] args) {
            Random rnd = new Random();
            int or = rnd.ints(0,2)
                    .limit(10000)
                    .sum();
            System.out.printf("Орел выпал %d раз(a), из 10000 бросаний, решка %d", or, 10000 - or);
        }
    }

