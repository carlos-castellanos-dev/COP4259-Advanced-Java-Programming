package util;

public class Egg extends Item {
	private int number;
	private double price;
	public Egg(String name, int number, double price) {
		super(name);
		this.number = number;
		this.price = price;
		}
	public int getCost()
	{
	return (int)Math.round(number*(price/12));
	}
	public String toString() {
		return number + " @ " + price/100 + "/dz.\n" + name + "\t" + GroceryStore.cents2dollarsAndCents(getCost());
		}
}
