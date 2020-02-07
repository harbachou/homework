package Messenger;

public class Validation {
    public static boolean validationName(String name) {
        if (name.matches("[A-Za-z0-9]+@[A-Za-z0-9.]+")) {
            return true;
        }
        return false;
    }

    public static boolean validationPassword(String password) {
        if (password.length() < 7) {
            System.out.println("Пароль должен содержать не менее 7 символов");
            return false;
        }

        if (password.matches("[A-Za-z0-9]*[':\\/!?+%]+[A-Za-z0-9]*")) {
            return true;
        }
        return false;
    }
}
