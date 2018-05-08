/* test comment
 * Class Name: RoachColony
 */

public class RoachColony implements Observer {

    private double growthRate;
    private int initialPopulation;
    private String colonyName;

    //constructor
    public RoachColony(String name, double growth, int population) {
        this.colonyName = name;
        this.growthRate = growth;
        this.initialPopulation = population;
    }

    public void update(boolean vacancySign) {
        if (!vacancySign) //if vacancy sign is turned off (false)                                            
        {
            System.out.println(colonyName + " received message");
        }
    }

    //when roaches throw party, the multiply by their growth factor
    public void throwParty() {
        this.initialPopulation += (initialPopulation * growthRate);               //increase popluation by growthRate
        System.out.println("After throwing party, " + this.toString());
    }

    //this method is called when the roach colony is sprayed with insecticide. Reduces colony by percent
    public void reduceColonyPopulation() {
        this.initialPopulation -= (initialPopulation * .50);
        System.out.println("After getting sprayed, " + this.toString());
    }

    public String toString() {
        String i = colonyName + ", Poplulation " + initialPopulation;
        return i;
    }
}
