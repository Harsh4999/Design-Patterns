package design.patterns.structural.composite;
/*
* Leaf node
* */
public class BinaryFile extends File{
    private long size;
    public BinaryFile(String name,long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName()+ " "+ size);
    }

    @Override
    public void addFile(File file) {
        throw new RuntimeException(" Not supported here by leaf node");
    }

    @Override
    public File[] getFiles() {
        throw new RuntimeException(" Not supported by leaf node");
    }

    @Override
    public Boolean removeFile(File file) {
        throw new RuntimeException(" Not supported by leaf node");
    }
}
