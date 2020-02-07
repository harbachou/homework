package Messenger;

import Messenger.api.IChat;
import Messenger.api.ISaver;

import java.io.Serializable;
import java.util.List;

public class Chat implements IChat, Serializable {

//    @Override
//    public long countMessages() {
//        return 0;
//    }
//
//    @Override
//    public long countUsers() {
//        return 0;
//    }
//
//    @Override
//    public void addMessage(IMessage message) {
//
//    }
//
//    @Override
//    public void addMessage(IMessage[] message) {
//
//    }
//
//    @Override
//    public void addMessage(List<IMessage> message) {
//
//    }

    @Override
    public void addMessage(Message message) {

    }

    @Override
    public List<Message> getMessages() {
        return null;
    }

    @Override
    public void save(ISaver saver) {

    }
}
