package design.patterns.structural.proxy;

import java.util.Map;

public class BitmapImage implements Image{
    private Map<Integer,Integer> location;
    private String name;
    public BitmapImage(String filename){
        System.out.println("Loaded from disk "+filename);
        this.name=filename;

    }
    @Override
    public void setLocation(Map<Integer, Integer> location) {
        this.location=location;
    }

    @Override
    public Map<Integer, Integer> getLocation() {
        return this.location;
    }

    @Override
    public void render() {
        System.out.println("Rendered  "+ name);
    }
}
