package Lambdas;

import Messenger.api.IMessage;
import Messenger.api.MessageType;

public class LambdasMain3 {
    public static void main (String [] args){
        FuncInterface3<IMessage> filter = (e) ->{
            if(e.getType().equals(MessageType.PHOTO)){
                return false;
            }
            return true;
        };
    }
}
