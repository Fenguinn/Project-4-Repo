package application;

public class MenuItem {
	double price;
	
	/**
	 * The default constructor for a instance of an menu item class.
	 */
	public MenuItem () {}
	
	/**
	 * An overloaded constructor for a instance of an menu item class that accepts a double as a price.
	 * @param itemPrice is the price of an item
	 */
	public MenuItem (double itemPrice) {
		this.price = itemPrice;
	}
	
	/**
	 * A method that calculates and returns the price of this item
	 * @return price, a double containing the price of the item
	 */
	public double itemPrice() {
		return price;
	}

}
