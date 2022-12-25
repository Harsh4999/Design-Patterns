package design.patterns.structural.facade;

public class Client {
    public static void main(String[] args) {
       EmailFacade facade = new EmailFacade();
       boolean res = facade.sendEmail("Hello ");
        System.out.println("Msg sent "+(res? "successfully": "failed"));
    }

}
