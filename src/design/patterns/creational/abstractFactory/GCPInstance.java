package design.patterns.creational.abstractFactory;

public class GCPInstance implements Instance{
    public GCPInstance(Capacity capacity){
        System.out.println("Create GCP instance");
    }
    @Override
    public void start() {
        System.out.println("GCP instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to GCP ");
    }

    @Override
    public void stop() {
        System.out.println("GCP instance stopped");
    }
}
