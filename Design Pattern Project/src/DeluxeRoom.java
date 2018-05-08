/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: DeluxeRoom.java
 * Purpose: Creates a deluxe room.
 * Input: N/A.
 * Output: N/A.
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
