package Messenger.api;

import Messenger.User;
import sun.plugin2.message.Message;

import java.util.List;
import java.util.Set;

public interface IChat {
   void addMessage(IMessage message);
   Set<User> getUserChat();
   List<Message> getMessageChat();
}
