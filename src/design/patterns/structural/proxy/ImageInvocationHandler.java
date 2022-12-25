package design.patterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/*
* Dynamic proxy
* */
public class ImageInvocationHandler implements InvocationHandler {


    private String filename;
    private Map<Integer,Integer> location;
    private BitmapImage image;
    private static Method setLocationMethod;
    private static Method getLocationMethod;
    private static Method renderMethod;

    static{
        try{
            setLocationMethod = Image.class.getMethod("setLocation",new Class[] {Map.class});
            getLocationMethod = Image.class.getMethod("getLocation",null);
            renderMethod = Image.class.getMethod("render",null);
        }catch(NoSuchMethodException e){
            System.out.println(e.getMessage());
        }
    }

    public ImageInvocationHandler(String filename){
        this.filename=filename;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(setLocationMethod.equals(method)){
            Map<Integer,Integer> m = (Map<Integer, Integer>) args[0];
            if(image!=null){
                image.setLocation(m);
            }else{
                this.location=m;
            }

        }else if(getLocationMethod.equals(method)){
            if(image!=null){
                return image.getLocation();
            }else{
                return this.location;
            }
        }else if(renderMethod.equals(method)){
            if(image!=null){
                image.render();
            }else{
                image = new BitmapImage(filename);
                if(location!=null){
                    image.setLocation(location);
                }
                image.render();
            }
        }
        return null;
    }
}
