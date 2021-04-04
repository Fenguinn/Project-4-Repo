package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.TextArea;

public class CurrentOrderController {
	
	
	
	
	
	@FXML
	private TextArea TextArea;
	@FXML
	private TextField SubTotalBox;
	@FXML
	private TextField TaxBox;
	@FXML
	private TextField TotalBox;
	@FXML
	private Button RemoveSelectedButton;
	@FXML
	private Button PlaceOrderButton;

	@FXML
	private void initialize() {
		update();
	}
	
	@FXML
	private void update() {
		MMController.myOrder.calculatePayment();
		TextArea.clear();
		TextArea.appendText(MMController.myOrder.toString() + "\n");
		
		
		SubTotalBox.setText(""+MMController.myOrder.getSubtotal());
		TaxBox.setText(""+MMController.myOrder.getSalesTax());	
		TotalBox.setText(""+MMController.myOrder.getTotal());	
	}
	
	
	
}
