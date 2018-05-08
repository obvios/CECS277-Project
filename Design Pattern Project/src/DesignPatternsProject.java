
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
        HotelRoom factory = new HotelRoom();
        Room room1 = factory.getRoom("Deluxe");
        Room room2 = new Spa(new FoodBar(new SprayResistantShower(factory.getRoom("Suite"))));
        room1.addColony(new RoachColony("Colony 1", 0.50, 100));
        room2.addColony(new RoachColony("Colony 2", .21, 94));
        motel.add(room1);
        motel.add(room2);
        Room room3 = new SprayResistantShower(factory.getRoom("Regular"));
        Room room4 = new FoodBar(new Spa(factory.getRoom("Deluxe")));
        Room room5 = new FoodBar(new SprayResistantShower(factory.getRoom("Deluxe")));
        motel.add(room3);
        motel.add(room4);
        motel.add(room5);
        Room room6 = new SprayResistantShower(new Spa(factory.getRoom("Regular")));
        room6.addColony(new RoachColony("Dummy", 20389.0, 29384));
        motel.add(room6);
        motel.checkOut(3);
        ;
    }
}
