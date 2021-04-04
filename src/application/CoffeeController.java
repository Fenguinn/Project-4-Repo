package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import javafx.scene.control.ComboBox;

import javafx.scene.control.CheckBox;

import javafx.scene.control.Button;
//DONT FORGET TO DO ALERTS
//DONT FORGET TO DO ALERTS
//DONT FORGET TO DO ALERTS
//DONT FORGET TO DO ALERTS
//DONT FORGET TO DO ALERTS
//DONT FORGET TO DO ALERTS

public class CoffeeController {
	public final static int ONE = 1;
	public final static int TWO = 2;
	public final static int THREE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	public final static int SIX = 6;
	public final static int SEVEN = 7;
	public final static int EIGHT = 8;
	public final static int NINE = 9;
	public final static int TEN = 10;
	public final static int ELEVEN = 11;
	public final static int TWELVE = 12;
	
	Coffee myCoffee;
	
	@FXML
	private CheckBox Cream;
	@FXML
	private CheckBox Syrup;
	@FXML
	private CheckBox Milk;
	@FXML
	private CheckBox Caramel;
	@FXML
	private CheckBox WhippedCream;
	@FXML
	private TextField RunningTotal;
	@FXML
	private ComboBox<String> CoffeeSize;
	@FXML
	private ComboBox<Integer> NumberOfCoffee;
	@FXML
	private Button AddToOrderButton;
	
	
	/**
	 * 
	 */
	@FXML
	private void initialize() {
		myCoffee = new Coffee();
		myCoffee.setSize(ONE);
		
		CoffeeSize.getItems().addAll("Short" , "Tall", "Grande" , "Venti");
		NumberOfCoffee.getItems().addAll( ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE);
	}
	@FXML
	private void update() {
		
		double total = myCoffee.itemPrice();
		RunningTotal.setText(myCoffee.formatPrice(total));
	}
	
	
	@FXML
	private void handleCream(ActionEvent e){
		if (Cream.isSelected()) 
			myCoffee.add("Cream");
			
        else
            myCoffee.remove("Cream");
		update();
    }
	
	@FXML
	private void handleSyrup(ActionEvent e){
		if (Syrup.isSelected()) 
			myCoffee.add("Syrup");
			
        else
            myCoffee.remove("Syrup");
		update();
    }
	
	@FXML
	private void handleMilk(ActionEvent e){
		if (Milk.isSelected()) 
			myCoffee.add("Milk");
			
        else
            myCoffee.remove("Milk");
		update();
    }
	
	@FXML
	private void handleCaramel(ActionEvent e){
		if (Caramel.isSelected()) 
			myCoffee.add("Caramel");
			
        else
            myCoffee.remove("Caramel");
		update();
    }
	
	@FXML
	private void handleWhippedCream(ActionEvent e){
		if (WhippedCream.isSelected()) 
			myCoffee.add("Whipped Cream");
			
        else
            myCoffee.remove("Whipped Cream");
		update();
    }
	
	@FXML 
	private void handleSize(ActionEvent e) {
		String size = CoffeeSize.getValue();
		
		if (size.equals("Short")) {
			myCoffee.setSize(ONE);
		}
		else if (size.equals("Tall")) {
			myCoffee.setSize(TWO);
		}
		else if (size.equals("Grande")) {
			myCoffee.setSize(THREE);
		}
		else if (size.equals("Venti")) {
			myCoffee.setSize(FOUR);
		}
		update();
		//RunningTotal.setText(myCoffee.toString());
	}
	
	@FXML
	private void handleQuantity(ActionEvent e) {
		Integer quantity = NumberOfCoffee.getValue();
		myCoffee.setQuantity(quantity);
		update();
		//RunningTotal.setText(""+myCoffee.getQuantity());
	}
	
	@FXML
	private void addToOrder(ActionEvent e) {
		RunningTotal.setText("gent1");
		MMController.myOrder.add(myCoffee);
		RunningTotal.setText("gent2");
		Cream.setSelected(false); 
		Milk.setSelected(false);
		Caramel.setSelected(false);
		WhippedCream.setSelected(false);
		Syrup.setSelected(false);
//		CoffeeSize.setValue("Short");
		//NumberOfCoffee.setValue(ONE);
		RunningTotal.setText("gent3");
		
		myCoffee = new Coffee();
	
		String size = CoffeeSize.getValue();
		RunningTotal.setText("gent4");
		if (size.equals("Short")) {
			myCoffee.setSize(ONE);
		}
		else if (size.equals("Tall")) {
			myCoffee.setSize(TWO);
		}
		else if (size.equals("Grande")) {
			myCoffee.setSize(THREE);
		}
		else if (size.equals("Venti")) {
			myCoffee.setSize(FOUR);
		}
		RunningTotal.setText("gent4");
		
		int quantity = NumberOfCoffee.getValue();
		myCoffee.setQuantity(quantity);
		RunningTotal.setText("gent5");
	}

	
	
	
	
}
