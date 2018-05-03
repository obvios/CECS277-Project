/**
 * Observer.java
 *
 * Observers implement this interface so that
 * their update() method is called by the subject
 * when the state of the subject changes.
 */

package designpatternsproject;

//
public interface Observer {
	/**
	 * This method is called when the state of the subject
	 * changes. 
	 * @param newState - the new state of the subject
	 */
	public void update(boolean roomAvailable);
}