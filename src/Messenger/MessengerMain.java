package Messenger;

import Messenger.api.MessageType;

import java.util.Date;

public class MessengerMain {
    public static void main(String[] args) {
        Registration reg = new Registration();
        User user1 = reg.registration("newmail@gmail.com", "1%{fRd,");
        User user2 = reg.registration("oldmail@gmail.com", "6@aJ321");

        Chat chat = new Chat();

        chat.addMessage(new Message(user1, new Date(), "Привет", MessageType.TEXT));
        chat.addMessage(new Message(user2, new Date(), "Привет, на пиво нет", MessageType.TEXT));

    }
}

