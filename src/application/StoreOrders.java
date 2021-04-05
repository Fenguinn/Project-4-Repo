package application;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class StoreOrders implements Customizable {
	private ArrayList<Order> storeOrdersList;
	
	
	
	public StoreOrders() {
		storeOrdersList = new ArrayList<Order>();
	}
	
	public int getSize() {
		return this.storeOrdersList.size();
	}
	
	public Order getOrder(int index) {
		return this.storeOrdersList.get(index);
	}
	
	
	
	@Override
	public boolean add(Object obj) {
		if (obj instanceof Order) {
			Order order = (Order)obj;
			this.storeOrdersList.add(order);
			return true;
		}
		return false;
	}
		

	//might have to change to int instead of object obj
	@Override
	public boolean remove(Object obj) {
		if (obj instanceof Order) {
			Order order = (Order)obj;
			this.storeOrdersList.remove(order);
			return true;
		}		
		return false;
	}
	
	@Override
	public String toString() {
		//CHECK THAT ORDERS ARE NOT EMPTY1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		if (this.storeOrdersList.isEmpty())
			return null;
		
		String currString="";
		for (int i=0; i<this.storeOrdersList.size(); i++) {
			currString = currString + this.storeOrdersList.get(i).toString() + "\n";
		}
		return currString;
	}
		
		
	
	public void exportDatabase() {
		try {
			FileWriter writer = new FileWriter("storeOrders.txt");
			writer.write("WOWOWOWO TEST OW OW OWKEOQ KOJKROK");
			writer.close();
		}
		
		catch(IOException e){
			
		}
	}
	
	
	
}
