package design.patterns.behavioral.chainOfResponsiblity;
//Abstract handler
public abstract class Employee implements LeaveApprover{
    private String role;
    private LeaveApprover successor;
    public Employee(String role,LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication application){
        if(!proccessRequest(application)&&successor !=null){
            successor.processLeaveApplication(application);
        }
    }
    protected abstract boolean proccessRequest(LeaveApplication application);
    @Override
    public String getApproverRole() {
        return role;
    }
}
