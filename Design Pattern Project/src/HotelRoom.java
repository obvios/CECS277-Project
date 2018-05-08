/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: HotelRoom.java
 * Purpose: Creates the different types of rooms.
 * Input: N/A.
 * Output: N/A.
 */

public class HotelRoom extends HotelRoomFactory {

    /* gets a room type */
    public Room getRoom(String type) {
        if (type.equals("Deluxe")) {
            return new DeluxeRoom();
        } else if (type.equals("Suite")) {
            return new Suite();
        } else if (type.equals("Regular")) {
            return new RegularRoom();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Hotel Room Factory";
    }
}
