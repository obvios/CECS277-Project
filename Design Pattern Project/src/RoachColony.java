/* test comment
 * Class Name: RoachColony
 */


public class RoachColony implements Observer{
        private double growthRate;
        private int initialPopulation;
        
        //constructor
        public RoachColony(double growth, int population){
            this.growthRate = growth;
            this.initialPopulation = population;
        }
    
	public void update(boolean vacancySign){
        if(!vacancySign)                                //if vacancy sign is turn off (false)                                            
            System.out.println("Waitlisted roach colony checking in.");
        }
        
        //when roaches throw party, the multiply by their growth factor
        public void throwParty(){
            this.initialPopulation +=  (initialPopulation * growthRate);               //increase popluation by growthRate
        }
}
