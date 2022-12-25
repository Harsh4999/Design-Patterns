package design.patterns.structural.composite;

public class Client {
    public static void main(String[] args) {
        File root1 = createTreeOne();
        root1.ls();
        File root2 = createTreeTwo();
        root2.ls();
    }
    private static File createTreeOne(){
        File f1 = new BinaryFile("File 1",10000);
        Directory dir1= new Directory("dir1");
        dir1.addFile(f1);
        File f2 = new BinaryFile("File 2",500);
        File f3 = new BinaryFile("File 3",900);
        Directory dir2 = new Directory("dir2");
        dir2.addFile(f2);
        dir2.addFile(f3);
        dir2.addFile(dir1);
        return dir2;
    }
    private static File createTreeTwo(){
        return  new BinaryFile("Another file",200);
    }
}
