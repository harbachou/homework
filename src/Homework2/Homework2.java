import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        int n,f;
        f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the number: ");
        if(sc.hasNextInt()) {
            n = sc.nextInt();
            for(int i=1; i<=n; i++) {
                f = f*i;
            }
            System.out.println(n+"! = "+f);
        }
    }

    public static class Homework1 {

        public static void main(String[] args) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }

        }
    }
}




