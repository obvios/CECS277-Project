package designpatternsproject;

public class FoodBar extends Amnemities{
	public static final double COST = 10.00;
	
	public FoodBar() {
		description = "Delicious Food Bar";
	}
	
	public double cost() {
		return COST;
	}
}
