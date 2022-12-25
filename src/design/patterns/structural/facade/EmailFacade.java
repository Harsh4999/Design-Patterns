package design.patterns.structural.facade;

public class EmailFacade {

    public  boolean sendEmail(String m){
        Message msg= new Message(m);
        Email e = new Email(msg);
        Gmail g = new Gmail();

        return g.send(e);
    }
}
