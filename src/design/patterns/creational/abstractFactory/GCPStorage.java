package design.patterns.creational.abstractFactory;

public class GCPStorage implements Storage{
    public GCPStorage(int capacityInMib){
        System.out.println("Allocated "+capacityInMib+ " in GCP");
    }

    @Override
    public String getId() {
        return "GCP1";
    }
}
