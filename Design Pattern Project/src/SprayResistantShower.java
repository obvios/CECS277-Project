/*
This is an amnenitie that decorates a hotel room.
*/
public class SprayResistantShower extends HotelDecorator{
    protected Room roomType;
    public static final double COST = 25.00;
    
    public SprayResistantShower(Room theRoom){
        this.roomType = theRoom;
    }
    
    @Override
    public String getDescription(){
        return roomType.getDescription() + " with a Spray Resistant Shower";
    }
    
    public double cost(){
        return COST;
    }
}
