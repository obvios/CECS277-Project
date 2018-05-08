/* 
 * Programmers: Eric Palma, Justin Do, Juan Pasillas, Jeffrey
 * Date: May 8, 2018
 * Class Name: HotelRoomFactory.java
 * Purpose: Abstract for making rooms.
 * Input: N/A.
 * Output: N/A.
 */

public abstract class HotelRoomFactory{
    
	/* gets room description */
    public abstract Room getRoom(String type);
}