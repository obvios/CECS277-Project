/*
 * Class Name: RoachMotel
 * Purpose: To implement the singleton design pattern
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class RoachMotel implements Subject {
    private static RoachMotel uniqueInstance;
    private static int initCapacityOfRooms = 5;           //number of rooms the motel has initially available.
    private boolean noVacancySign;             //true when there are no vacant rooms
    
    private Queue<Observer> waitlist;

    private ArrayList<RoachColony> rooms;

	
    //associates a colony with a room
    public static void add(RoachColony theColony, Room theRoom){       //added
        colonies.add(theColony);
        theRooms.add(theRoom);
    }
    
    public double calculateTotalCost(){                         //added
        double total = colonies.get(0).getNights() * theRooms.get(0).getCost();
        colonies.remove(0);
        theRooms.remove(0);
        checkOut();
        return total;
    }
    
    //private constructor
    private RoachMotel(){
        waitlist = new LinkedList<>();
	rooms = new ArrayList<>();
        noVacancySign = false;
	    
	//initializing empty rooms
	for(int i = 0; i < initCapacityOfRooms; i++)
	{
		rooms.add(new HotelRoom());	
	}
    };
    
    //returns this one and only instance of RoachMotel
    public synchronized static RoachMotel getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new RoachMotel();
        }
        return uniqueInstance;
    }
    
    public HotelRoom get(int index){
        return rooms.get(index);
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
            noVacancySign = false;                  //turn vacancy sign off
            notifyObservers();                      //notify observers that a room is open
        }  
    }
    
    /* allows an observer to register with the subject */
	public void addObserver( Observer o ){
        waitlist.add(o);
        System.out.println("New roach colony waitlisted with position of " + waitlist.size() + ".");
    }

	/* removes an observer */	
	public void removeObserver(){
		for(int i = 0; i < rooms.size(); i++)
		{
			if(!rooms.get(i).occupied)
			{
				rooms.get(i).checkIn(waitlist.poll());
			}
		checkIn();
        	System.out.println("Roach colony leaving waitlist and checking in to hotel room.");
        
    	}

	/* notifes all registered observers when its state changes */	
	public void notifyObservers(){
            for (Observer roachColony : waitlist){
		roachColony.update(uniqueInstance.noVacancySign);
            }
        }
        
        /*checkAvailability*/
        public static boolean checkAavailability(){
            return uniqueInstance.noVacancySign;                   //returns false if rooms available, returns true if no rooms available
        }
        
        @Override
        public String toString(){
            return "Roach Motel";
        }
}
