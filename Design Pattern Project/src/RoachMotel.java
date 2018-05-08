/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: RoachMotel.java
 * Purpose: Creates a roach motel.
 * Input: N/A.
 * Output: N/A.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RoachMotel implements Subject {

    private static RoachMotel uniqueInstance;
    private static int initCapacityOfRooms = 5;           //number of rooms the motel has initially available.
    private boolean noVacancySign;             //true when there are no vacant rooms

    private Queue<Observer> waitlist;

//    private ArrayList<RoachColony> rooms;
//    private ArrayList<RoachColony>colonies;
    private ArrayList<Room> theRooms;

    //private constructor
    private RoachMotel() {
        waitlist = new LinkedList<>();
        theRooms = new ArrayList<>();
        noVacancySign = false;
    }

    ;
    
    //returns this one and only instance of RoachMotel
    public synchronized static RoachMotel getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new RoachMotel();
        }
        return uniqueInstance;
    }

    public void add(Room theRoom) {       //added
//        colonies.add(theColony);
        if (!noVacancySign) {
            theRooms.add(theRoom);
            this.checkIn();
        } else {
            addObserver((RoachColony) theRoom.getColony());
        }

    }

//    public double calculateTotalCost(){                         //added
//        double total = colonies.get(0).getNights() * theRooms.get(0).getCost();
//        colonies.remove(0);
//        theRooms.remove(0);
//        checkOut();
//        return total;
//    }
    public Room get(int index) {
        return theRooms.get(index);
    }

    //called when a roach colony gets a room
    void checkIn() {
        initCapacityOfRooms--;
        if (initCapacityOfRooms == 0) //if no more rooms avaiable, turn No Vacancy Sign on
        {
            noVacancySign = true;
        }
    }

    //called when a roach colony checks out of a room
    void checkOut(int roomNumber) {
        Room tempRoom = theRooms.get(roomNumber - 1);
        System.out.println(tempRoom.getColony().toString() + " is checking out, they had: " + tempRoom.getDescription());
        System.out.println("Their total is: $" + tempRoom.cost());
        theRooms.remove(roomNumber - 1);
        if (initCapacityOfRooms != 5) {              //cant add more rooms than motel capacity
            initCapacityOfRooms++;
            noVacancySign = false;                  //turn vacancy sign off
            notifyObservers();                      //notify observers that a room is open
        }
    }

    /* allows an observer to register with the subject */
    public void addObserver(Observer o) {
        waitlist.add(o);
        RoachColony tempColony = (RoachColony) o;
        System.out.println(o.toString() + " waitlisted at position " + waitlist.size() + ".");
    }

    /* removes an observer */
    public void removeObserver() {
//        rooms.add((RoachColony) waitlist.poll());
        waitlist.remove((RoachColony) waitlist.poll());
        checkIn();
        System.out.println("Roach colony leaving waitlist.");

    }

    /* notifes all registered observers when its state changes */
    public void notifyObservers() {
        for (Observer roachColony : waitlist) {
            roachColony.update(noVacancySign);
        }
    }

    /*checkAvailability*/
    public static boolean checkAavailability() {
        return uniqueInstance.noVacancySign;                   //returns false if rooms available, returns true if no rooms available
    }

    //throw party for each colony
    public void throwParties(){
        for(Room theRoom : theRooms){
           theRoom.getColony().throwParty();
        }
    }
    
    //sprays all the rooms with insecticide
    public void sprayParties(){
        for(Room theRoom : theRooms){
           theRoom.getColony().reduceColonyPopulation();
        }
    }
    
    @Override
    public String toString() {
        return "Roach Motel";
    }
}
