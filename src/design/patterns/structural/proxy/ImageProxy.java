package design.patterns.structural.proxy;

import java.util.Map;

/*
* Proxy class
* */
public class ImageProxy implements Image{
    private BitmapImage realImage;
    private String name;
    private Map<Integer,Integer> location;

    public ImageProxy(String filename){
        this.name=filename;
    }

    @Override
    public void setLocation(Map<Integer, Integer> location) {
        if(realImage!=null){
            this.realImage.setLocation(location);
        }else{
            this.location=location;
        }
    }

    @Override
    public Map<Integer, Integer> getLocation() {
        if(realImage!=null){
            return this.realImage.getLocation();
        }
        return this.location;

    }

    @Override
    public void render() {
        if(realImage!=null){
            realImage.render();
        }else{
            realImage = new BitmapImage(name);
            if(location!=null){
                realImage.setLocation(location);
            }
            realImage.render();
        }
    }
}
