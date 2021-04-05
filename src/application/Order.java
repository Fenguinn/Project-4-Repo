package application;

import java.util.ArrayList;

public class Order implements Customizable {
	private final static double NJTAX = .06625;
	
	
	private ArrayList<MenuItem> items; 
	private double subtotal;
	private double total;
	private double salesTax; //= subtotal*tax
	
	
	public Order() {
		items = new ArrayList<MenuItem>(); 
//	numOrders = 0;
	}
	
	
	public void calculatePayment() {
		this.subtotal =0;
		for (int i=0; i<items.size(); i++) {
			this.subtotal += items.get(i).itemPrice();
		}
		
		salesTax = subtotal * NJTAX;
		total = salesTax + subtotal;

	}
	
	public String getSubtotal() {
		MenuItem item = new MenuItem();
		return item.formatPrice(this.subtotal);
	}

	public String getTotal() {
		MenuItem item = new MenuItem();
		return item.formatPrice(this.total);
		
	}
	public String getSalesTax() {
		MenuItem item = new MenuItem();
		return item.formatPrice(this.salesTax);
	}
	
	public boolean isEmpty() {
		return this.items.isEmpty();
	}
	
	
	
	
	
	@Override
	public boolean add(Object obj) {
		if (obj instanceof MenuItem) {
			MenuItem item = (MenuItem)obj;
			boolean inBag = false;
			for (int i=0; i<items.size(); i++) {
				if (items.get(i).equals(item)) {
					items.get(i).incrementQuantity(item.getQuantity());
					inBag = true;
				}
			}
			if (inBag == false)
				items.add(item);
			
			return true;
		}
		
		
		
		return false;
	}
	
	@Override
	public boolean remove(Object obj) {
		if (obj instanceof MenuItem) {
			MenuItem item = (MenuItem)obj;
			for (int i=0; i<items.size(); i++) {
				if (items.get(i).equals(item)) {
					items.remove(i);
					return true;
				}
			}
		}
		else if (obj instanceof String) {
			String item = (String)obj;
			for (int x = 0; x < items.size(); x++) {
				if (items.get(x).toString().equals(item)) {
					items.remove(x);
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Order) {
			Order newOrder = (Order)obj;
			if (this.toString().equals(newOrder.toString())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String currString="";
		for (int i=0; i<items.size(); i++) {
			currString = currString + items.get(i).toString() + "\n";
		}
		return currString;
	}
	
	
}
