/* test comment
 * Class Name: RoachColony
 */


public class RoachColony implements Observer{
        private double growthRate;
        private int initialPopulation;
        private String colonyName;
        
        //constructor
        public RoachColony(String name, double growth, int population){
            this.colonyName = name;
            this.growthRate = growth;
            this.initialPopulation = population;
        }
    
	public void update(boolean vacancySign){
        if(!vacancySign)                                //if vacancy sign is turned off (false)                                            
            System.out.println(colonyName + " received message");
        }
        
        //when roaches throw party, the multiply by their growth factor
        public void throwParty(){
            this.initialPopulation +=  (initialPopulation * growthRate);               //increase popluation by growthRate
        }
        
        //this method is called when the roach colony is sprayed with insecticide. Reduces colony by percent
        public void reduceColonyPopulation(double percent){
            this.initialPopulation -= (initialPopulation * percent);
        }
        
        public void getPopulation(){
            return initialPopulation;
        }
        
        public String toString(){
            String i = "Colony Name: " + colonyName + " Poplulation " + initialPopulation;
            return i;
        }
}
