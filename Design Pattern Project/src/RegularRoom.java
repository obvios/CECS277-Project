/*
This class creates a Regular Room
*/

public class RegularRoom extends Room{
	public static final double COST = 50.00;
    public RegularRoom() {
        description = "Regular Room";
    }
   
    public double cost() {
        return COST;
    }
    
    @Override
        public toString(){
            return "Regular Room";
        }
}
