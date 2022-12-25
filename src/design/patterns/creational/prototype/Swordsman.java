package design.patterns.creational.prototype;

public class Swordsman extends GameUnit{
    private String state = "idle";
    public void attack(){
        this.state="attack";
    }

    @Override
    public String toString() {
        return "Swordsman "+ state+ " "+getPosition();
    }

    @Override
    protected void reset() {
        this.state="idle";
    }
}
