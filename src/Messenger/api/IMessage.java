package Messenger.api;

import javax.xml.crypto.Data;
import java.util.Date;

public interface IMessage <T> {
    MessageType getType();

    Date getData();
    void setDate (Date date);

    T getDate();
    void setDate (T data);
}
