/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: RegularRoom.java
 * Purpose: Creates a regular room.
 * Input: N/A.
 * Output: N/A.
 */

public class RegularRoom extends Room{
	
	public static final double COST = 50.00; //base rate of room per night
    private RoachColony theColony; //room occupant
    
    /* room contructor */
    public RegularRoom() {
        description = "Regular Room";
    }
   
    /* returns cost per night */
    public double cost() {
        return COST;
    }
    
    /* adds a colony to the room */
    public void addColony(RoachColony colony){
        this.theColony = colony;
    }
    
    /* returns the colony */
    public RoachColony getColony(){
        return theColony;
    }
    
    @Override
    public String toString() {
        return "Regular";
    }
}
