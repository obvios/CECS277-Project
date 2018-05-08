
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
