package design.patterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ImageFactory {
    public static Image getImage(String name){
        return  new ImageProxy(name);
    }

    public static Image getDynamicImage(){
        return (Image) Proxy.newProxyInstance(
                ImageFactory.class.getClassLoader(),
                new Class[]{Image.class},
                new ImageInvocationHandler("AI2.img"));
    }
}
