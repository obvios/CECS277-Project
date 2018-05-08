/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: RegularRoom.java
 * Purpose: Creates a regular room.
 * Input: N/A.
 * Output: N/A.
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
