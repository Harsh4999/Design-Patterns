package design.patterns.structural.flyweight;

import java.time.Duration;

public class UserBannedErrorMessage implements ErrorMessage {
    private String caseId;
    private String remarks;
    private Duration banDuration;
    private String msg;
    public UserBannedErrorMessage(String caseId){
        this.caseId=caseId;
        remarks="You violated terms";
        banDuration=Duration.ofDays(2);
        msg = "You are banned for 2 days";
        msg+= " More information \n";
        msg+= caseId+"\n";
        msg+=remarks+"\n";
    }

    @Override
    public String getText(String code) {
        return this.msg;
    }
    public String getCaseNo(){
        return caseId;
    }
}
