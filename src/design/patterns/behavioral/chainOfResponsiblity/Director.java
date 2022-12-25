package design.patterns.behavioral.chainOfResponsiblity;

public class Director extends Employee{

    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    protected boolean proccessRequest(LeaveApplication application) {
        if(application.getType()== LeaveApplication.Type.PTO){
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
