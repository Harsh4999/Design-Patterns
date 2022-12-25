package design.patterns.behavioral.chainOfResponsiblity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Describes a request in our chain of responsiblity
public class LeaveApplication {
    public enum Type {Sick,PTO,LOP};
    public enum  Status {Pending,Approved,Rejected};
    private Type type;
    private LocalDate from;
    private LocalDate to;
    private String processedBy;
    private Status status;
    public LeaveApplication(Type type,LocalDate from,LocalDate to){
        this.type=type;
        this.from = from;
        this.to = to;
        this.status = Status.Pending;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(String processedBy) {
        this.processedBy = processedBy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public long getNoOfDays(){
        return from.until(to, ChronoUnit.DAYS);
    }
    public void approve(String role){
        System.out.println("Your leave was approved by: "+role);
        this.status=Status.Approved;
    }
}
