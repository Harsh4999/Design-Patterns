package design.patterns.creational.abstractFactory;

public class Ec2Instance implements Instance{
    public Ec2Instance(Capacity capacity){
        System.out.println("Created EC2");
    }
    @Override
    public void start() {
        System.out.println("Ec2 started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Ec2 "+ storage+" attached");
    }

    @Override
    public void stop() {
        System.out.println("Ec2 stopped");
    }


}
