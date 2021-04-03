package application;

public class Coffee extends MenuItem implements Customizable  {
	private static final double COFFEE_PRICE_DEFAULT = 1.49; // the price of a small coffee - 50 cents
	private static final double  PRICE_PER_ADD_IN= 0.20;
	private static final double  PRICE_PER_SIZE_UP = 0.50;
	private static final int SHORT = 1;
	private static final int TALL = 2;
	private static final int GRANDE = 3;
	private static final int VENTI = 4;
	private static final int ONE = 1;
	
	private boolean cream;
	private boolean milk;
	private boolean whippedCream;
	private boolean syrup;
	private boolean caramel;
	private int numOfAddIns;
	private int size;
	
	public Coffee() {
		super(COFFEE_PRICE_DEFAULT, ONE);
	}
	
	public void setSize(int newSize) {
		this.size = newSize;
	}
	
	/**
	 * A method that calculates and returns the price of this item
	 * @return a double containing the price of the item
	 */
	@Override 
	public double itemPrice() {
		return this.price + (this.size * PRICE_PER_SIZE_UP) + (this.numOfAddIns * PRICE_PER_ADD_IN);
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override 
	public boolean add(Object obj) {
		if (obj instanceof String) {
			String AddIn = (String)obj;
			if (AddIn.equals("Cream") && !this.cream) {
				this.numOfAddIns++;
				this.cream = true;
				return true;
			}
			else if (AddIn.equals("Milk") && !this.milk) {
				this.numOfAddIns++;
				this.milk = true;
				return true;
			}
			else if (AddIn.equals("Whipped Cream") && !this.whippedCream) {
				this.numOfAddIns++;
				this.whippedCream = true;
				return true;
			}
			else if (AddIn.equals("Syrup") && !this.syrup) {
				this.numOfAddIns++;
				this.syrup = true;
				return true;
			}
			else if (AddIn.equals("Caramel") && !this.caramel) {
				this.numOfAddIns++;
				this.caramel = true;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	@Override
	public boolean remove(Object obj) {
		if (obj instanceof String) {
			String AddIn = (String)obj;
			if (AddIn.equals("Cream") && this.cream) {
				this.numOfAddIns--;
				this.cream = false;
				return true;
			}
			else if (AddIn.equals("Milk") && this.milk) {
				this.numOfAddIns--;
				this.milk = false;
				return true;
			}
			else if (AddIn.equals("Whipped Cream") && this.whippedCream) {
				this.numOfAddIns--;
				this.whippedCream = false;
				return true;
			}
			else if (AddIn.equals("Syrup") && this.syrup) {
				this.numOfAddIns--;
				this.syrup = false;
				return true;
			}
			else if (AddIn.equals("Caramel") && this.caramel) {
				this.numOfAddIns--;
				this.caramel = false;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return ;
	}
}
