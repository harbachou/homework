package Messenger.api;


import Messenger.Message;

import java.util.List;

public interface IChat {
   // long countMessages();
   // long countUsers();

    void addMessage (Message message);
    List<Message> getMessages();
    void save(ISaver saver);
}
