package design.patterns.behavioral.chainOfResponsiblity;
//Abstract handler
public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication application);
    String getApproverRole();
}
