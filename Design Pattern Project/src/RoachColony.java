/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: RoachColony.java
 * Purpose: Creates a roach colony.
 * Input: N/A.
 * Output: N/A.
 */

public class RoachColony implements Observer {

    private double growthRate;
    private int initialPopulation;
    private String colonyName;

    /* roach colony constructor */
    public RoachColony(String name, double growth, int population) {
        this.colonyName = name;
        this.growthRate = growth;
        this.initialPopulation = population;
    }

    /* updates room status and notifies for available rooms */
    public void update(boolean vacancySign) {
        if (!vacancySign) //if vacancy sign is turned off (false)                                            
        {
            System.out.println(colonyName + " received message");
        }
    }

    /* when roaches throw party, the multiply by their growth factor */
    public void throwParty() {
        this.initialPopulation += (initialPopulation * growthRate); //increase popluation by growthRate
        System.out.println("After throwing party, " + this.toString());
    }

    /* this method is called when the roach colony is sprayed with insecticide. Reduces colony by percent */
    public void reduceColonyPopulation() {
        this.initialPopulation -= (initialPopulation * .50);
        System.out.println("After getting sprayed, " + this.toString());
    }

    @Override
    public String toString() {
        String i = colonyName + ", Poplulation " + initialPopulation;
        return i;
    }
}
