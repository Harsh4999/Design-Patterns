package design.patterns.behavioral.chainOfResponsiblity;

import java.time.LocalDate;

import static design.patterns.behavioral.chainOfResponsiblity.LeaveApplication.Type.LOP;
import static design.patterns.behavioral.chainOfResponsiblity.LeaveApplication.Type.PTO;

public class Client {
    public static void main(String[] args) {
        LeaveApplication application =new LeaveApplication(PTO, LocalDate.now(),LocalDate.of(2022,12,31));
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application.getStatus());
    }
    public static LeaveApprover createChain(){
        //make chain of responsibility
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead projectLead = new ProjectLead(manager);
        return projectLead;
    }
}
