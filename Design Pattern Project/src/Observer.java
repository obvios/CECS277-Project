/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: Observer.java
 * Purpose: Interface to update subjects on room status.
 * Input: N/A.
 * Output: N/A.
 */

public interface Observer {
	/**
	 * This method is called when the state of the subject
	 * changes. 
	 * @param newState - the new state of the subject
	 */
	public void update(boolean roomAvailable);
}
