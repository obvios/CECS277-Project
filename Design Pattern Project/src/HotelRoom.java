/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: HotelRoom.java
 * Purpose: Creates the different types of rooms.
 * Input: N/A.
 * Output: N/A.
 */

public class HotelRoom extends HotelRoomFactory {

    //returns a room
    public Room getRoom(String type,boolean shower) {
        if (type.equals("Deluxe")) {
            Room theRoom = new DeluxeRoom();
            if(shower == true) theRoom.toggleShower();
            return theRoom;
        } else if (type.equals("Suite")) {
            Room theRoom = new Suite();
            if(shower == true) theRoom.toggleShower();
            return theRoom;
        } else if (type.equals("Regular")) {
            Room theRoom = new RegularRoom();
            if(shower == true) theRoom.toggleShower();
            return theRoom;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Hotel Room Factory";
    }
}
