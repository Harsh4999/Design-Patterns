package design.patterns.behavioral.state;
//Context
public class Order {
    private OrderState currentStat;
    public Order(){
        currentStat=new New();
    }
    public double cancel(){
        double charge = currentStat.handleCancellation();
        currentStat=new Cancelled();
        return charge;
    }
    public void paymentSuccessful(){
        currentStat = new Paid();
    }
    public void dispatched(){
        currentStat=new InTransit();
    }
    public void delivered(){
        currentStat=new Delivered();
    }
}
