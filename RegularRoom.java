package designpatternsproject;

public class RegularRoom extends Room{
	public static final double COST = 50.00;
    public RegularRoom() {
        description = "Regular Room";
    }
    public RegularRoom(String desc) {
        description = desc;
    }
    public double cost() {
        return COST;
    }
}
