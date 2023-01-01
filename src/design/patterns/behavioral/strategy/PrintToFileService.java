package design.patterns.behavioral.strategy;

import java.util.LinkedList;

//Context
public class PrintToFileService {
    private OrderPrinter printer;
    public PrintToFileService(OrderPrinter printer){
        this.printer=printer;
    }
    public void printOrders(LinkedList<Order> orders){
        printer.print(orders);
    }
}
