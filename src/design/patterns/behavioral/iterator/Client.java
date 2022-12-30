package design.patterns.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        Iterator<ThemeColor> itr = ThemeColor.getIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
