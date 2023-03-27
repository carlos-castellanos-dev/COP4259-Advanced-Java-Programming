package driver;
import java.util.ArrayList;

import util.*;

public class Checkout {
	private ArrayList<Item> checkoutList;
	  
	   Checkout(){
	       checkoutList= new ArrayList<Item>();
	   }
	  
	   public int numberOfItems(){
	       return checkoutList.size();
	   }
	  
	   public int totalCost(){
	       int sum=0;
	       for (Item i : checkoutList){
	           sum+=i.getCost();
	       }
	       return sum;
	   }
	  
	   public int totalTax(){
	       return (int) Math.round(GroceryStore.TAX_RATE*totalCost()/100.0);
	   }
	   
	   public int finalCost(){
	       return (int) totalTax() + totalCost();
	   }
	  
	   public void clear(){
	       checkoutList.clear();
	   }
	  
	   public void enterItem(Item i){
	       checkoutList.add(i);
	   }
	  
	   public String toString(){
		   System.out.println(GroceryStore.STORE_NAME);
		   System.out.println("------------------------");
		   for(int i=0;i<checkoutList.size();i++)
		   {
		   System.out.println(checkoutList.get(i));
		   }
		   System.out.println("Tax: "+GroceryStore.cents2dollarsAndCents(totalTax()));
		   System.out.println("Total Cost: "+GroceryStore.cents2dollarsAndCents(finalCost()));
		     
		   return "";
		   }
}
