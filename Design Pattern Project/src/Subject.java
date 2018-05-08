/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: Subject.java
 * Purpose: Registers and notifies observers.
 * Input: N/A.
 * Output: N/A.
 */

public interface Subject {

	/* allows an observer to register with the subject */
	public void addObserver( Observer o );

	/* removes an observer */	
	public void removeObserver();

	/* notifes all registered observers when its state changes */	
	public void notifyObservers();
}
