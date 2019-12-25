package Tell;

public class Main {
    public static void main(String[] args){
        Tell oldPhone = new Tell();
        GSMTell gsmPhone = new GSMTell();
        Smart smartPhone = new Smart();
                oldPhone.call();
                gsmPhone.call();
                smartPhone.call();
    }
}
