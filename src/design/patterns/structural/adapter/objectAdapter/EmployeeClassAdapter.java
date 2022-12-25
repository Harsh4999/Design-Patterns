package design.patterns.structural.adapter.objectAdapter;

public class EmployeeClassAdapter implements Customer{
    private Employee adpatee;
    public EmployeeClassAdapter(Employee adaptee) {
        this.adpatee=adaptee;
    }

    @Override
    public String getName() {
        return adpatee.getFullName();
    }

    @Override
    public String getDestination() {
        return adpatee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adpatee.getLocation();
    }
}
