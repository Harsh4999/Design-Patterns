package design.patterns.creational.singleton;

public class LazyRegistryIODH {
    private LazyRegistryIODH(){
        System.out.println("The instance will not be created until getInstance is called and it will create instance only once");
    }
    private static class RegistryHolder{
        static LazyRegistryIODH INSTANCE= new LazyRegistryIODH();

    }
    public static LazyRegistryIODH getINSTANCE(){
        return RegistryHolder.INSTANCE;
    }
}
