package design.patterns.behavioral.strategy;


import java.util.LinkedList;

public class Client {
    private static LinkedList<Order> orders= new LinkedList<>();
    public static void main(String[] args) {
        createOrders();
        PrintToFileService printToFileService = new PrintToFileService(new SummaryPrinter());
        printToFileService.printOrders(orders);
    }
    public static void createOrders(){
        Order o = new Order("1");

    }
}
