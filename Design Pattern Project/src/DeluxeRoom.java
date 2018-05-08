/*
This class creates a Deluxe Room
*/

public class DeluxeRoom extends Room{
    public static final double COST = 75.00;
    private RoachColony theColony;
    
    public DeluxeRoom() {
        description = "Deluxe Room";
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
    
    @Override
        public String toString(){
            return "Deluxe Room";
        }
}
