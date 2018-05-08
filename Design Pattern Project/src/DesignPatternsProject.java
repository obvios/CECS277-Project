
import java.util.ArrayList;

/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: DesignPatternsProject.java
 * Purpose: Tests combination of other classes/design pattern in main.
 * Input: Roach colony starting population and growth rate.
 * Output: Roach colony population and checkout costs.
 */

public class DesignPatternsProject {

    public static void main(String[] args) {
        RoachMotel Motel = RoachMotel.getInstance();
        HotelRoomFactory factory = new HotelRoom();
        
        /*create rooms*/
        Room room1 = new FoodBar(new Spa(factory.getRoom("Deluxe")));
        Room room2 = new SprayResistantShower(factory.getRoom("Suite"));
        Room room3 = factory.getRoom("Regular");
        Room room4 = new FoodBar(new Spa(new SprayResistantShower(factory.getRoom("Regular"))));
        Room room5 = factory.getRoom("Suite");
        Room room6 = factory.getRoom("Deluxe");
        Room room7 = new Spa(factory.getRoom("Deluxe"));
        
        /*create colonies*/
        RoachColony colony1 = new RoachColony("colony 1", .10, 100);
        RoachColony colony2 = new RoachColony("colony 2", .20, 100);
        RoachColony colony3 = new RoachColony("colony 3", .30, 100);
        RoachColony colony4 = new RoachColony("colony 4", .40, 100);
        RoachColony colony5 = new RoachColony("colony 4", .50, 100);
        RoachColony colony6 = new RoachColony("colony 5", .60, 100);
        RoachColony colony7 = new RoachColony("colony 6", .70, 100);
        
        /*add colonies to rooms*/
        room1.addColony(colony1);
        room2.addColony(colony2);
        room3.addColony(colony3);
        room4.addColony(colony4);
        room5.addColony(colony5);
        room6.addColony(colony6);
        room7.addColony(colony7);
        
        /*add rooms to motel*/
        Motel.add(room1);
        Motel.add(room2);
        Motel.add(room3);
        Motel.add(room4);
        Motel.add(room5);
        Motel.add(room6);
        Motel.add(room7);
        
        /*throw parties*/
        System.out.println("\nColonies are throwing parties...");
        Motel.throwParties();
        /*spray parties*/
        System.out.println("\nAfter spraying parties...");
        Motel.sprayParties();
        
        /*check out a colony*/
        System.out.println("\nColony 4 checking out...");
        Motel.checkOut(4);
    }
}
