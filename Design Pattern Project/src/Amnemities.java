public abstract class Amnemities extends Room{
	protected String description;
	
	//creates description of what hotel extras are added
	public String getDescription() {
		return description;
	}
	
	//returns the cost of the rent
	public abstract double cost();
}
