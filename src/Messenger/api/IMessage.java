package Messenger.api;

import Messenger.User;

import java.util.Date;

public interface IMessage<T> {
    User getUser();
    MessageType getType();
    String getData();
    void setDate (Date date);
    T getDate();
    void setDate (T data);
}
