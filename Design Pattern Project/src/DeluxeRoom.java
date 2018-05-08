/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: DeluxeRoom.java
 * Purpose: Creates a deluxe room.
 * Input: N/A.
 * Output: N/A.
 */

public class DeluxeRoom extends Room {

    public static final double COST = 75.00; //base rate of room per night
    private RoachColony theColony; //room occupant
    
    /* room contructor */
    public DeluxeRoom() {
        description = "Deluxe Room";
    }

    /* returns cost per night */
    public double cost() {
        return COST;
    }

    /* adds a colony to the room */
    public void addColony(RoachColony theColony) {
        this.theColony = theColony;
    }

    /* returns the colony */
    public RoachColony getColony() {
        return theColony;
    }

    @Override
    public String toString() {
        return "Deluxe Room";
    }
}
