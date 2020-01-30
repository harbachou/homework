//package io;
//
//import java.io.*;
//
//public class IOMain3 {
//    public static void main(String[] args) {
//        messenger.dto.chat.TextChat chat = new messenger.dto.chat.TextChat();
//        try(OutputStream stream = new FileOutputStream("file_text.txt");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream)){
//            objectOutputStream.writeObject(chat);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
