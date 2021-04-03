package application;

import javafx.fxml.FXML; 

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.ListView;

import javafx.scene.control.ComboBox;

import javafx.scene.control.TextArea;

public class orderingDonutController {
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
	private ComboBox<String> donutTypeComboBox;
	@FXML
	private ListView<String> listDonutFlavor;
	@FXML
	private ComboBox<Integer> numDonutComboBox;
	@FXML
	private Button addDonutButton;
	@FXML
	private Button removeDonutButton;
	@FXML
	private TextArea donutOrderTextArea;
	@FXML
	private TextField runningTotalDonut;
	@FXML
	private Button addToOrderDonutButton;

	/**
	 * 
	 */
	@FXML
	public void initialize() {
		donutTypeComboBox.getItems().addAll("Yeast" , "Donut Hole", "Cake Donut");
		numDonutComboBox.getItems().addAll(ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE);
		listDonutFlavor.getItems().addAll("Jelly Creampie", "Boston Creampie (Extra thicc)", "Strawberry Lemon Swirl");
	}
}
