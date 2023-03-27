package util;

public class Rice extends Item {
	private double weight;
	private double price;
	public Rice(String name, double weight, double price) {
		super(name);
		this.weight = weight;
		this.price = price;
		}
	public int getCost()
	{
	return (int)Math.round(weight*price);
	}
	public String toString() {
		return weight + " lbs. @ " + price/100 + "/lb." + "\n" + name + "\t" + GroceryStore.cents2dollarsAndCents(getCost());
	}
}
