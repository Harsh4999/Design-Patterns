package design.patterns.creational.abstractFactory;

public class Client {
    private ResourceFactory factory;
    public Client(ResourceFactory factory){
        this.factory=factory;
    }
    public Instance createServer(Instance.Capacity cap,int storage){
        Instance instance = this.factory.createInstance(cap);
        Storage storage1 = this.factory.createStorage(storage);
        instance.attachStorage(storage1);
        return instance;
    }
    public static void main(String[] args) {
        Client aws = new Client(new AWSResourceFactory());
        Instance f1 = aws.createServer(Instance.Capacity.micro,2040);
        f1.start();
        f1.stop();
    }
}
