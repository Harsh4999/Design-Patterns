package design.patterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Message msg = new TextMessage("Hello world");
        System.out.println(msg.getContent());
        Message decorator = new HTMLEncodedDecorator(msg);
        System.out.println(decorator.getContent());

        //recursive composition
        decorator = new Base64EncodedMessage(msg);
        System.out.println(decorator.getContent());
    }
}
