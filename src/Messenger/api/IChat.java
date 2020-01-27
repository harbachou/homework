package Messenger.api;

public interface IChat {
   void addMessage(IMessage<?> message);
   void addMessage(IMessage message);
   void addMessage(IMessage[] message);
}
