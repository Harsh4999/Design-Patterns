package design.patterns.structural.facade;

public class Gmail {
    public Boolean send(Email email){
        String message = email.composeEmail();
        System.out.println("Gmail sent "+ message);
        return true;
    }
}
