package designpatternsproject;

public class Spa extends Amnemities{
	public static final COST = 20.00;
	
	public Spa() {
		description = "Luxury Spa";
	}
	
	public double cost() {
		return COST;
	}
}
