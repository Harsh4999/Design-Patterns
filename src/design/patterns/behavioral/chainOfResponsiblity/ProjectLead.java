package design.patterns.behavioral.chainOfResponsiblity;
//concrete handler
public class ProjectLead extends Employee{

    public ProjectLead(LeaveApprover successor){
        super("Project Lead",successor);
    }
    @Override
    protected boolean proccessRequest(LeaveApplication application) {
        //type of leave is sick leave or duration is upto 2 days
        if(application.getType()== LeaveApplication.Type.Sick){
            if(application.getNoOfDays()<=2){
                application.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }
}
