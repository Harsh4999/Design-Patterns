package design.patterns.structural.facade;

public class Message implements MessageInterface{
    public String msg;
    public Message(String msg){
        this.msg = msg;
    }
    @Override
    public String getMessage() {
        return this.msg;
    }

    @Override
    public void setMessage(String msg) {
        this.msg = msg;
    }
}
