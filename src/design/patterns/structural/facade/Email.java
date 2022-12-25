package design.patterns.structural.facade;

public class Email {
    MessageInterface msg;
    public Email(MessageInterface msg){
        this.msg = msg;
    }
    public String composeEmail(){
        String m = this.msg.getMessage();
        m+= "Message ";
        this.msg.setMessage(m);
        return this.msg.getMessage();
    }
}
