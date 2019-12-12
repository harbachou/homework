public class Homework10 {

    public static void main(String[] args) {
        int a []  = {15, 45, 70, 14, 24, 55, 85, 13};
        for (int i = 0; i < a.length; i++) {
           int y = i;
            for (int j = i; j < a.length; j++) {
                if (a[y] < a[j])
                    y = j;
            }
            int t = a[y];
            a[y] = a[i];
            a[i] = t;
            System.out.println(a[i]);
        }
    }
}





