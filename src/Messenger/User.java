package Messenger;

import sun.security.x509.UniqueIdentity;

public class User {
    private long id;

    public User(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    private String name;
    private String password;
}
