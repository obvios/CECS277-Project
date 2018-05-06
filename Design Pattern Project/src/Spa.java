public class Spa extends HotelDecorator{
        protected Room roomType;
	public static final double COST = 20.00;
	
	public Spa(Room theRoom) {
		this.roomType = theRoom;
	}
        
        @Override
        public String getDescription(){
            return roomType.getDescription() + " with a spa";
        }
	
	public double cost() {
		return roomType.cost() + COST;
	}
}
