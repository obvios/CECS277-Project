/*
This class creates a Deluxe Room
*/

public class DeluxeRoom extends Room{
    public static final double COST = 75.00;
    
    public DeluxeRoom() {
        description = "Deluxe Room";
    }
   
    public double cost() {
        return COST;
    }
}
