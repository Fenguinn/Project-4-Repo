package application;

public class Coffee extends MenuItem implements Customizable  {
	public static final double COFFEE_PRICE_DEFAULT = 1.49; // the price of a small coffee - 50 cents
	public static final double  PRICE_PER_ADD_IN= 0.20;
	public static final double  PRICE_PER_SIZE_UP = 0.50;
	public static final int SHORT = 1;
	public static final int TALL = 2;
	public static final int GRANDE = 3;
	public static final int VENTI = 4;
	
	
	public Coffee() {
		super(COFFEE_PRICE_DEFAULT);
	}
	
	/**
	 * A method that calculates and returns the price of this item
	 * @return a double containing the price of the item
	 */
	@Override 
	public double itemPrice() {}
	
	
	/**
	 * 
	 * @return
	 */
	@Override 
	boolean add(Object obj);
	
	/**
	 * 
	 * @return
	 */
	@Override
	boolean remove(Object obj);
}
