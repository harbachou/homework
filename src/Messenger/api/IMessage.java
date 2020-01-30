package Messenger.api;

import java.util.Date;

public interface IMessage <T> {
    MessageType getType();

    Date getData();
    void setDate (Date date);

    T getDate();
    void setDate (T data);
}
