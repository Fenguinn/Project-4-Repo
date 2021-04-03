package application;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import javafx.scene.control.ComboBox;

import javafx.scene.control.CheckBox;

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
	
	/**
	 * 
	 */
	@FXML
	public void initialize() {
		CoffeeSize.getItems().addAll("Short" , "Tall", "Grande" , "Venti");
		NumberOfCoffee.getItems().addAll( ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE);
	}
	
}
