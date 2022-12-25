package design.patterns.creational.singleton;
/*
*
* This class demonstrates singleton using double checked looking or classic singleton
* This implementation solves multithreading issue by using volatile and double check locking but the
* volatile keyword is gauranteed to work only after JVM starting with v1.5 or later in java
*
* */
public class LazyRegistry {
    private LazyRegistry(){

    }
    //volatile forces the threads to read and write from main memory instead depend on cpu cache
    private static volatile LazyRegistry INSTANCE; //volatile will indicate the threads to not use the cached version of this var
    public static LazyRegistry getInstance(){
        //null check
        if(INSTANCE==null){
            //object lock for not running into parallel calls
            synchronized (LazyRegistry.class){
                //double check for lock for not letting 2 threads enter into this block simultaneously and let one wait
                if(INSTANCE==null){
                    INSTANCE = new LazyRegistry();
                }
            }
        }
        return INSTANCE;
    }
}

