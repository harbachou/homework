package Regular;


public class Regular {
    public static void main(String[] args) {
        System.out.println("20934".matches("-?[0-9]+"));

        String str = "Test     string for split";
        String[] words = str.split("  +");
        for (String word : words) {
            System.out.println(word + "  ");
        }
    }
}
