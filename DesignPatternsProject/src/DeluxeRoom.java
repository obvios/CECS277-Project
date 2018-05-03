
public class DeluxeRoom extends Room{
	public static final double COST = 75.00;
    public DeluxeRoom() {
        description = "Deluxe Room";
    }
    public DeluxeRoom(String desc) {
        description = desc;
    }
    public double cost() {
        return COST;
    }
}
