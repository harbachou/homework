package Regular;

public class RegularMain2 {
    public static void main(String[] args) {
        String [] mails = new String [] {
                "newmail2619@gmail.com"
        };
        for (String mail : mails) {
            System.out.println("Мэйл " + mail + ". Результат проверки " + mail.matches("[a-zA-Z0-9]+@[a-zA-Z0-9.]+"));
        }
    }
}
