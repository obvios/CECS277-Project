/* test comment
 * Class Name: RoachColony
 */
package designpatternsproject;

/**
 *
 * @author ericpalma
 */
public class RoachColony implements Observer{
    /**
	 * This method is called when the state of the subject
	 * changes. 
	 * @param newState - the new state of the subject
	 */
	public void update(boolean roomAvailable){
        if(roomAvailable)
            System.out.println("Waitlisted roach colony checking in.");
    }
}
