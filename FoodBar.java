package designpatternsproject;

public class FoodBar extends Amnemities{
	public static final COST = 10.00;
	
	public FoodBar() {
		description = "Delicious Food Bar";
	}
	
	public double cost() {
		return COST;
	}
}
