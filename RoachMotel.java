/*
 * Class Name: RoachMotel
 * Purpose: To implement the singleton design pattern
 */
package designpatternsproject;

/**
 *
 * @author ericpalma
 */
public class RoachMotel {
    private static RoachMotel uniqueInstance;
    private int initCapacityOfRooms = 50;           //number of rooms the motel has initially available.
    private boolean noVacancySign = false;             //true when there are no vacant rooms
    //private constructor
    private RoachMotel(){};
    
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
        if(initCapacityOfRooms != 50) initCapacityOfRooms++;  //cant add more rooms than motel capacity
    }
}
