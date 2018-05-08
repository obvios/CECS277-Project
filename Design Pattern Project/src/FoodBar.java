/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: FoodBar.java
 * Purpose: Adds a food bar to the room.
 * Input: N/A.
 * Output: N/A.
 */

public class FoodBar extends HotelDecorator {

    protected Room roomType;
    public static final double COST = 10.00;

    public FoodBar(Room theRoom) {
        this.roomType = theRoom;
    }

    @Override
    public String getDescription() {
        return roomType.getDescription() + " with a Food Bar";
    }

    public double cost() {
        return roomType.cost() + COST;
    }

    @Override
    public String toString() {
        return "Food Bar";
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
