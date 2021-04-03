package application;

public class MenuItem {
	double price;
	int quantity;
	
	/**
	 * The default constructor for a instance of an menu item class.
	 */
	public MenuItem () {}
	
	/**
	 * An overloaded constructor for a instance of an menu item class that accepts a double as a price.
	 * @param itemPrice is the price of an item
	 */
	public MenuItem (double itemPrice, int number) {
		this.price = itemPrice;
		this.quantity = number;
	}
	
	/**
	 * A method that calculates and returns the price of this item
	 * @return price, a double containing the price of the item
	 */
	public double itemPrice() {
		return this.price;
	}
	
	public void setQuantity(int number) {
		this.quantity = number;
	}

}
