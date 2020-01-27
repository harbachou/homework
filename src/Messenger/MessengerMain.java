package Messenger;

public class MessengerMain {
    public static void main (String[] args) {
        Registration reg = new Registration();
        User user1 = reg.registration("newmail@gmail.com", "123456");
        User user2 = reg.registration("oldmail@gmail.com","654321");
    }
}
