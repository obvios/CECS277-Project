/*
This class is an abstract class for how a 
hotel room factory should be.
*/
public abstract class HotelRoomFactory{
    
    public abstract Room getRoom(String type);
}