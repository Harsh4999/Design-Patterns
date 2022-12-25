package design.patterns.creational.objectPool;

import java.util.Map;

public class Bitmap implements Image {
    private Map<Integer,Integer> location;
    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing "+ name+ " at "+ this.location.get(0)+ " "+ this.location.get(1));
    }

    @Override
    public Map<Integer, Integer> getLocation() {

        return this.location;
    }

    @Override
    public void setLocation(Map<Integer, Integer> location) {
        this.location=location;
    }

    @Override
    public void reset() {
        this.location=null;
        System.out.println("reset of        object");
    }
}
