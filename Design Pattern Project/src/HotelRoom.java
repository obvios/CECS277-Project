/*
This class is the hotel room factory.
It is in charge of creating the different kinds of rooms
*/
package designpatternsproject;

public class HotelRoom extends HotelRoomFactory {
	
		 
	//returns a room
	public Room getRoom(String type){
            if(type.equals("Deluxe")){
                return new DeluxeRoom();
            }
            else if (type.equals("Suite")){
                return new Suite();
            }
            else if (type.equals("Regular")){
                return new RegularRoom();
            }
            else return null;
        }
}
