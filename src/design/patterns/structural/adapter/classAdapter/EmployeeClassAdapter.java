package design.patterns.structural.adapter.classAdapter;

public class EmployeeClassAdapter extends Employee implements Customer {
    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDestination() {
        return this.getLocation();
    }

    @Override
    public String getAddress() {
        return this.getJobTitle();
    }
}
