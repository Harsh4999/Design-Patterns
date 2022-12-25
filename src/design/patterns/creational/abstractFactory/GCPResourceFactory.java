package design.patterns.creational.abstractFactory;
//factory implementation of Type 2 i.e GCP
public class GCPResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GCPInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new GCPStorage(capacityInMib);
    }
}
