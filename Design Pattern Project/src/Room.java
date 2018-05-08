
public abstract class Room {
	protected String description;
	
	private RoachColonoy occupant;
	
	public HotelRoom()
	{
		occupant = null;
	}
	
	public void checkIn(RoachColonoy client)
	{
		occupant = client;
	}
	
	public void checkOut()
	{
		occupant = null;	
	}
	
	public boolean occupied()
	{
		return occupant != null;	
	}

	 // returns the description of the room
	 public String getDescription() {
	  return description;
	 }
	 
	 // returns the cost of the room
	 public abstract double cost();
         
        @Override
         public String toString(){
             return description + " " + cost();
         }
}
