package design.patterns.creational.singleton;
/*
* Presented at Google I/O
* 1) We cannot extend from enum so not worry about inheritence
* 2) It takes care of creating only one single object
* 3) Also provides serialization desirialization
* */
public enum EnumRegistry {
    INSTANCE;
    public void getConfiguration(){

    }
}
