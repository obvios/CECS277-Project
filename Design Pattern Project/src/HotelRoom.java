/*
This class is the hotel room factory.
It is in charge of creating the different kinds of rooms
*/
package designpatternsproject;

public abstract class HotelRoom extends Room {
	
		 
	//returns a room
	public abstract Room getRoom(String type);
}
