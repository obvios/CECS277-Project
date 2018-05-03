
public class Suite extends Room{
	public static final double COST = 100.00;
    public Suite() {
        description = "Suite";
    }
    public Suite(String desc) {
        description = desc;
    }
    public double cost() {
        return COST;
    }
}
