package Messenger;

import Messenger.api.IMessage;
import Messenger.api.MessageType;

import java.util.Date;

public class Message implements IMessage<String> {
    private final User user;
    private Date date;
    private String data;
    MessageType type;

    public Message (User user, Date date, String data, MessageType type) {
        this.user = user;
        this.date = date;
        this.data = data;
        this.type = type;
    }

    @Override
    public User getUser() {

        return user;
    }

    @Override
    public MessageType getType() {

        return MessageType.TEXT;
    }

    @Override
    public String getData() {

        return data;
    }

    @Override
    public void setDate(Date date) {

        this.date = date;
    }

    @Override
    public String getDate() {

        return null;
    }

    @Override
    public void setDate(String data) {

    }

    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", type=" + type +
                ", date=" + date +
                ", data=" + data +
                '}';
    }
}


