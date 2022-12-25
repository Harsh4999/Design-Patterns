package design.patterns.creational.prototype;
//Class represents an abstract prototype
public abstract class GameUnit implements Cloneable{
    private String state;

    @Override
    protected GameUnit clone() throws CloneNotSupportedException {
        //decide shallow or deep copy
        //shallow copy
        GameUnit unit = (GameUnit) super.clone();
        //If we dont reset things the old object values will be copied and the new object will not be fresh
        unit.initialize();
        return unit;
    }
    protected void initialize(){
        //to reset the variable of the prototype class
        this.state="idle";
        reset();
    }
    protected abstract void reset();
    public GameUnit() {
        this.state = "idle";
    }

    public GameUnit(String xy) {
        this.state = xy;
    }
    public void move(){
        this.state = "Moving";
    }
    public String getPosition(){
        return this.state;
    }
}
