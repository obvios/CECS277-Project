public class FoodBar extends HotelDecorator{
        protected Room roomType;
	public static final double COST = 10.00;
	
	public FoodBar(Room theRoom) {
		this.roomType = theRoom;
	}
	
        @Override
        public String getDescription() {
            return roomType.getDescription() + " with a Food Bar";
        }
        
	public double cost() {
		return roomType.cost() + COST;
	}
        
        @Override
            public toString(){
                return "Food Bar";
            }
}
