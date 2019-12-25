package Tell;

public class Smart extends GSMTell {
    public void Internet() {
        System.out.println("Войти в интернет");
    }

    public void Playmusic() {
        System.out.println("Играет музыка");
    }

    @Override
    public void call() {
        System.out.println("Отключаем интернет");
        System.out.println("Идут гудки");
        System.out.println("Включаем интернет");
    }

   /* public void call(String number) {
        this.call(number, stopCall: false);
    }*/

    public void call(String number, boolean stopCall) {
        System.out.println("Отключаем интернет");
        System.out.println("Идут гудки");
        System.out.println("Включаем интернет");
        if (stopCall) {
            System.out.println("Неожиданно бросаем телефон");
        }
        System.out.println("Включить интернет");
    }
}
