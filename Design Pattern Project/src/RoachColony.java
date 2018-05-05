/* test comment
 * Class Name: RoachColony
 */


public class RoachColony implements Observer{
    /**
	 * This method is called when the state of the subject
	 * changes. 
	 * @param newState - the new state of the subject
	 */
	public void update(boolean vacancySign){
        if(!vacancySign)                                //if vacancy sign is turn off (false)                                            
            System.out.println("Waitlisted roach colony checking in.");
    }
}
