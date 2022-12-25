package design.patterns.creational.factoryMethod;

public class Client {
    public static void main(String[] args) {
        Message m = new JSONMessageCreator().getMessage();
        System.out.println(m);
        m = new TextMessageCreator().getMessage();
        System.out.println(m);
    }
}
