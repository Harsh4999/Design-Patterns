package design.patterns.creational.singleton;
/*
* This class uses eager init of singleton instance
* */
public class EagerRegistry {
    private EagerRegistry(){

    }
    private static final EagerRegistry INSTANCE = new EagerRegistry();
    public static EagerRegistry getInstance(){
        return INSTANCE;
    }

}
