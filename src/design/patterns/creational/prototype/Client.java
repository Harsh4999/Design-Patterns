package design.patterns.creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s = new Swordsman();
        s.move();
        s.attack();
        System.out.println(s);
        Swordsman s1 = (Swordsman) s.clone();
        System.out.println(s1);
    }
}
