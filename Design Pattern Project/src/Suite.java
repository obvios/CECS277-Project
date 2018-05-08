/*
This class creates a Suite room
*/

public class Suite extends Room{
	public static final double COST = 100.00;
        private RoachColony theColony;
    public Suite() {
        description = "Suite";
    }
    
    public double cost() {
        return COST;
    }
    
    public void addColony(RoachColony theColony){
        this.theColony = theColony;
    }
    
    public RoachColony getColony(){
        return theColony;
    }
    
    @Override
        public String toString(){
            return "Suite";
        }
}
