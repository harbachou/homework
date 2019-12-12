import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        for (String str : args);
        int n,f;
        f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the number: ");
        if(sc.hasNextInt()) {
            n = sc.nextInt();
            for(int i=1; i<=n; i++){
                f = f*i;
            }
            System.out.println(n+"! = "+f);
        }
    }

    }




