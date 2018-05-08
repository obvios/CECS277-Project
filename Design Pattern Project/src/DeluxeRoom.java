/*
This class creates a Deluxe Room
 */

public class DeluxeRoom extends Room {

    public static final double COST = 75.00;
    private RoachColony theColony;

    public DeluxeRoom() {
        description = "Deluxe Room";
    }

    public double cost() {
        return COST;
    }

    public void addColony(RoachColony theColony) {
        this.theColony = theColony;
    }

    public RoachColony getColony() {
        return theColony;
    }

    @Override
    public String toString() {
        return "Deluxe Room";
    }
}
