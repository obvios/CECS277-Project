/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: SprayResistantShower.java
 * Purpose: Adds a spray resistant shower to a room.
 * Input: N/A.
 * Output: N/A.
 */

public class SprayResistantShower extends HotelDecorator {

    protected Room roomType;
    public static final double COST = 25.00;

    public SprayResistantShower(Room theRoom) {
        this.roomType = theRoom;
    }

    @Override
    public String getDescription() {
        return roomType.getDescription() + " with a Spray Resistant Shower";
    }

    public double cost() {
        return roomType.cost() + COST;
    }

    @Override
    public String toString() {
        return "Spray Resistant Shower";
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
