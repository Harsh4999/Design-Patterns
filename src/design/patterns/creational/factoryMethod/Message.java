package design.patterns.creational.factoryMethod;

import java.time.LocalDateTime;

public abstract class Message {
    private String msg;
    private LocalDateTime createdOn;
    private LocalDateTime expiresOn;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(LocalDateTime expiresOn) {
        this.expiresOn = expiresOn;
    }
    public void encrypt(){
        System.out.println("Message encrypted");
    }
}
