package util;

public class Baguette extends Item {
	private double cost;
	public Baguette(String name, double cost) {
		super(name);
		this.cost = cost;
		}
	public int getCost()
	{
	return (int)Math.round(cost);
	}
	public String toString() {
		return name +"\t" + GroceryStore.cents2dollarsAndCents(getCost());
		}
}
