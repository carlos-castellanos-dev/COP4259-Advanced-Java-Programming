package util;

public class FlavoredBaguette extends Baguette {
	private String flavorName;
	public FlavoredBaguette(String name, double cost,String fname, double falvorCost) {
		super(name,(cost+falvorCost));
		this.flavorName=fname;
		}
	public int getCost() {
		return super.getCost();
		}
	public String toString() {
		return super.name+" with "+flavorName+"\t"+GroceryStore.cents2dollarsAndCents(getCost());
		}
}
