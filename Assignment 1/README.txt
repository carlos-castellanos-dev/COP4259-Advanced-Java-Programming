Q: Explain what each method of each class does in one of two sentences.

------------------------------------------
Util Package
------------------------------------------

Baguette Class:

- Baguette Method: Constructor for this class that initializes all instance fields (inheriited ones and non-inherited ones).
- getCost Method: Overridden method that returns the rounded cost of each item. 
- toString Method: Overridden method with no input parameters that returns prints a string representing the reciept of the item. 

Egg Class:

-Egg Method: Constructor for this class that initializes all instance fields (inheriited ones and non-inherited ones).
-getCost Method: Overridden method that returns the rounded cost of each item. 
-toString Method: Overridden method with no input parameters that returns prints a string representing the reciept of the item. 

Flavored Baguette Class:

-FlavoredBaguette Method: Constructor for this class that initializes all instance fields (inheriited ones and non-inherited ones).
-getCost Method: Overridden method that returns the rounded cost of each item. 
-toString Method: Overridden method with no input parameters that returns prints a string representing the reciept of the item. 

Grocery Store Class:

-cents2dollarsAndCents Method: Takes an integer number of cents and returns it as a String formatted in dollars and cents.

Item Class:

-getName Method: Returns the name of each item. 
-getCost Method: Abstract method without implementation which gets overridden in every subclass of class Item.

Rice Class:

-Rice Method: Constructor for this class that initializes all instance fields (inheriited ones and non-inherited ones).
-getCost Method: Overridden method that returns the rounded cost of each item. 
-toString Method: Overridden method with no input parameters that returns prints a string representing the reciept of the item. 

------------------------------------------
Driver Package
------------------------------------------
Checkout Class:

-numberOfItems Method: Returns the number of items in the checkout list.
-totalCost Method: Returns the total cost of an item without tax.
-totalTax Method: Returns the rounded amount of tax for the entire checkout list.
-finalCost Method: Returns the final cost of the checkout list including the total cost + total tax.
-clear Method: Clears the checkout list array.
-enterItem Method: Adds item to checkout list
-toString Method: Outputs a string representing a reciept for the items. 

