package design.patterns.creational.prototype;
//doesn't support cloning
public class General extends GameUnit{
    private String state = "idle";
    public void boostMorale(){
        this.state="Moral Boost";
    }

    @Override
    public String toString() {
        return "General "+state+" "+getPosition();
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported on generals");
    }

    @Override
    protected GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

}
