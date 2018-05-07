
import java.util.ArrayList;

/*  eyyyyyyyyyyy
 * Programmers: Eric Palma, Justin Do, Juan, Jeffrey
 * Class Name: Main
 * Input: 
 * Output:
 */

/**
 *
 * @author ericpalma
 */
public class DesignPatternsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RoachMotel motel = RoachMotel.getInstance();
        
        System.out.println("Any Open Rooms? " + !RoachMotel.checkAavailability() + "\n");
        
        while(!RoachMotel.checkAavailability()){
            motel.checkIn();
        }
        motel.addObserver(new RoachColony("Colony 1", 0.50, 15));
        motel.addObserver(new RoachColony("Colony 2", 0.75, 25));
        motel.addObserver(new RoachColony("Colony 3", 0.45, 10));
        motel.addObserver(new RoachColony("Colony 4", 0.23, 84));
        motel.addObserver(new RoachColony("Colony 5", 0.67, 42));
        
        System.out.println("Any Open Rooms? " + !RoachMotel.checkAavailability());
        System.out.println("\nAll Rooms of full hotel opening up\n");
        motel.checkOut();
        motel.removeObserver();
        motel.removeObserver();
        motel.removeObserver();
        motel.removeObserver();
        motel.removeObserver();
        motel.checkIn();
        
        ArrayList<Room> rooms = new ArrayList<>();
        HotelRoom temp = new HotelRoom();
        rooms.add(new FoodBar(new SprayResistantShower(temp.getRoom("Deluxe"))));
        rooms.add(temp.getRoom("Regular"));
        rooms.add(new FoodBar(new Spa(new SprayResistantShower(temp.getRoom("Suite")))));
        rooms.add(new FoodBar(new Spa(temp.getRoom("Deluxe"))));
        rooms.add(new SprayResistantShower(temp.getRoom("Regular")));
    }
}
