/*
 * Class Name: RoachMotel
 * Purpose: To implement the singleton design pattern
 */
package designpatternsproject;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ericpalma
 */
public class RoachMotel implements Subject {
    private static RoachMotel uniqueInstance;
    private static int initCapacityOfRooms = 50;           //number of rooms the motel has initially available.
    private boolean noVacancySign;             //true when there are no vacant rooms
    
    private Queue<Observer> waitlist;
    
    //private constructor
    private RoachMotel(){
        waitlist = new LinkedList<Observer>();
        noVacancySign = false;
    };
    
    //returns this one and only instance of RoachMotel
    public synchronized static RoachMotel getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new RoachMotel();
        }
        return uniqueInstance;
    }
    
    //called when a roach colony gets a room
    void checkIn(){
        initCapacityOfRooms--;                     
        if(initCapacityOfRooms == 0)               //if no more rooms avaiable, turn No Vacancy Sign on
            noVacancySign = true;
    }
    
    //called when a roach colony checks out of a room
    void checkOut(){
        if(initCapacityOfRooms != 50){              //cant add more rooms than motel capacity
            initCapacityOfRooms++;
            noVacancySign = false;
        }  
    }
    
    /* allows an observer to register with the subject */
	public void addObserver( Observer o ){
        waitlist.add(o);
        System.out.println("New roach colony waitlisted with position of " + waitlist.size() + ".");
    }

	/* removes an observer */	
	public void removeObserver( Observer o ){
        waitlist.poll();
        System.out.println("Roach colony leaving waitlist and entering hotel.");
        
    }

	/* notifes all registered observers when its state changes */	
	public void notifyObservers(){
        for (Observer roachColony : observers)
			roachColony.update(noVacancySign);
    }
}
