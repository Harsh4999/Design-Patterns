package design.patterns.creational.abstractFactory;

public class S3Storage implements Storage {
    public  S3Storage(int capacityInMib){
        System.out.println("Allocated "+capacityInMib+ " on s3");
    }
    @Override
    public String getId() {
        return "S31";
    }
}
