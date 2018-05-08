/*
This class creates a Regular Room
*/

public class RegularRoom extends Room{
	public static final double COST = 50.00;
        private RoachColony theColony;
    public RegularRoom() {
        description = "Regular Room";
    }
   
    public double cost() {
        return COST;
    }
    
    //adds a colony to the room
    public void addColony(RoachColony colony){
        this.theColony = colony;
    }
    
    //returns the colony
    public RoachColony getColony(){
        return theColony;
    }
}
