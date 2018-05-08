/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: Spa.java
 * Purpose: Adds a spa to a room.
 * Input: N/A.
 * Output: N/A.
 */

public class Spa extends HotelDecorator {

    protected Room roomType; //room type
    public static final double COST = 20.00; //cost of extra per night

    /* Instantiates extra's room type */
    public Spa(Room theRoom) {
        this.roomType = theRoom;
    }

    @Override
    public String getDescription() {
        return roomType.getDescription() + " with a spa";
    }

    /* returns added cost per night */
    public double cost() {
        return roomType.cost() + COST;
    }

    @Override
    /* adds colony to room */
    public void addColony(RoachColony colony) {
        roomType.addColony(colony);
    }

    @Override
    /* returns colony in room */
    public RoachColony getColony() {
        return roomType.getColony();
    }
    
    @Override
    public String toString() {
        return "Spa";
    }
}
