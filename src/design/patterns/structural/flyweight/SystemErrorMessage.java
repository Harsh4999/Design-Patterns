package design.patterns.structural.flyweight;
/*
* Concrete flyweight. Instance is shared
* */
public class SystemErrorMessage implements ErrorMessage{
    //Intrinsic state
    private String messageTemplate;
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate,String helpUrlBase){
        this.messageTemplate=messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }
    //Extrinsic state
    @Override
    public String getText(String code) {

        return messageTemplate.replace("$errorCode",code)+helpUrlBase+code;
    }
}
