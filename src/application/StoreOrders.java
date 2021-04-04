package application;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class StoreOrders implements Customizable {
	private ArrayList<Order> storeOrders;
	
	
	
	
	
	@Override
	public boolean add(Object obj) {
		if (obj instanceof Order) {
			Order order = (Order)obj;
			storeOrders.add(order);
			return true;
		}
		return false;
	}
		

	//might have to change to int instead of object obj
	@Override
	public boolean remove(Object obj) {
		if (obj instanceof Order) {
			Order order = (Order)obj;
			storeOrders.remove(order);
			return true;
		}		
		return false;
	}
	
	@Override
	public String toString() {
		//CHECK THAT ORDERS ARE NOT EMPTY1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		if (storeOrders.isEmpty())
			return null;
		
		String currString="";
		for (int i=0; i<storeOrders.size(); i++) {
			currString = currString + storeOrders.get(i).toString() + "\n";
		}
		return currString;
	}
		
		
	
	
	
	public void exportDatabase() {
		try {
			FileWriter writer = new FileWriter("storeOrders.txt");
			writer.write(this.toString());
			writer.close();
		}
		
		catch(IOException e){
			
		}
	}
	
	
	
}
