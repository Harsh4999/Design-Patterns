package design.patterns.behavioral.state;
//Abstract state
public interface OrderState {
    double handleCancellation();
    OrderState next();
}
