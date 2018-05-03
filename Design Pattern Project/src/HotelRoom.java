package designpatternsproject;

public abstract class HotelRoom {
	public Room orderCone(String type) {
		Room room;
		//String desc;
		room = getRoom(type);
		//desc = room.getDescription();
		return room;
	}
		 
	//returns a room
	public abstract Room getRoom(String type);
}
