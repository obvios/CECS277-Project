/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: Room.java
 * Purpose: Model for creating a motel room.
 * Input: N/A.
 * Output: N/A.
 */

public abstract class Room {

    protected String description;

    // returns the description of the room
    public String getDescription() {
        return description;
    }

    // returns the cost of the room
    public abstract double cost();

    public abstract void addColony(RoachColony colony);

    //returns the colony
    public abstract RoachColony getColony();

    @Override
    public String toString() {
        return description + " " + cost();
    }
}
