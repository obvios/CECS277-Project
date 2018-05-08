/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: Spa.java
 * Purpose: Adds a spa to a room.
 * Input: N/A.
 * Output: N/A.
 */

public class Spa extends HotelDecorator {

    protected Room roomType;
    public static final double COST = 20.00;

    public Spa(Room theRoom) {
        this.roomType = theRoom;
    }

    @Override
    public String getDescription() {
        return roomType.getDescription() + " with a spa";
    }

    public double cost() {
        return roomType.cost() + COST;
    }

    @Override
    public String toString() {
        return "Spa";
    }

    @Override
    public void addColony(RoachColony colony) {
        roomType.addColony(colony);
    }

    @Override
    public RoachColony getColony() {
        return roomType.getColony();
    }
}
