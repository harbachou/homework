package Messenger;

import Messenger.api.IChat;
import Messenger.api.IMessage;
import sun.plugin2.message.Message;

import java.util.List;
import java.util.Set;

public class Chat implements IChat {

    @Override
    public void addMessage(IMessage message) {

    }

    @Override
    public Set<User> getUserChat() {
        return null;
    }

    @Override
    public List<Message> getMessageChat() {
        return null;
    }
}
