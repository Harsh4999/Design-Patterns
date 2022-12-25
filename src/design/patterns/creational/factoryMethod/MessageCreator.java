package design.patterns.creational.factoryMethod;

public abstract class MessageCreator {
    //factory method
    public abstract Message createMessage();
    public Message getMessage(){
        Message msg = createMessage();
        msg.encrypt();
        return msg;
    }
}
