package Messenger;

import Messenger.api.IUser;

import java.io.Serializable;

public class User implements IUser, Serializable {

    public int id;
    private String name;
    private String password;
    Chat chat = new Chat();

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
