package application;

public class MenuItem {
	private double price;
	private int quantity;
	
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
		return this.price * this.quantity;
	}
	
	
	/**
	 * 
	 * @param number
	 */
	public void setPrice(double number) {
		this.price = number;
	}
	
	/**
	 * 
	 * @return price
	 */
	public double getPrice() {
		return this.price;
	}
	
	
	/**
	 * 
	 * @param number
	 */
	public void setQuantity(int number) {
		this.quantity = number;
	}
	
	/**
	 * 
	 * @return quantity
	 */
	public int getQuantity() {
		return this.quantity;
	}
	
	/**
	 * 
	 * @param number
	 */
	public void incrementQuantity(int number) {
		this.quantity += number;
	}

}
