/*
This class creates a Suite room
*/

public class Suite extends Room{
	public static final double COST = 100.00;
    public Suite() {
        description = "Suite";
    }
    
    public double cost() {
        return COST;
    }
    
    @Override
        public String toString(){
            return "Suite";
        }
}
