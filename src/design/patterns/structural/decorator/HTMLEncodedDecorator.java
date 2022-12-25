package design.patterns.structural.decorator;
/*
* Decorator 1
* */
public class HTMLEncodedDecorator implements Message{

    private Message msg;
    public HTMLEncodedDecorator(Message msg){
        this.msg = msg;
    }
    @Override
    public String getContent() {
        return "<html>\n "+ msg.getContent()+"\n</html>";
    }
}
