
public abstract class Room {
	protected String description;

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
