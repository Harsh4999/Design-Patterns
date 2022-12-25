package design.patterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();
        System.out.println(registry == registry1);


        LazyRegistry lazyRegistry = LazyRegistry.getInstance();
        LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
        System.out.println(lazyRegistry1 == lazyRegistry);

        LazyRegistryIODH s;

        s= LazyRegistryIODH.getINSTANCE();
        s=LazyRegistryIODH.getINSTANCE();
        s= LazyRegistryIODH.getINSTANCE();
    }
}
