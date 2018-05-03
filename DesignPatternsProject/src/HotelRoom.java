
public abstract class HotelRoom {
	public Room orderCone(String type) {
		  Room room;
		  //String desc;
		  room = getRoom(type);
		  //desc = room.getDescription();
		  return room;
		 }
		 
		 /**
		  * Returns an IceCream based upon the specified type.
		  */
		 public abstract Room getRoom(String type);
}
