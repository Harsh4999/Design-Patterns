package design.patterns.structural.composite;
/*
* Abstract class- Component
* */
public abstract class File {
    private String name;
    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void ls();
    public abstract void addFile(File file);
    public abstract File[] getFiles();
    public abstract Boolean removeFile (File file);
}
