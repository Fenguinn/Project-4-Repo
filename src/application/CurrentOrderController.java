package application;

import java.util.StringTokenizer;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class CurrentOrderController {
	
	
	
	
	
	@FXML
	private ListView<String> TextArea;
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
		this.TextArea.getItems().clear();
		StringTokenizer tokens = new StringTokenizer(MMController.myOrder.toString() + "\n" , "\n");
		while (tokens.hasMoreTokens()) {
			this.TextArea.getItems().add(tokens.nextToken());
		}
		
		SubTotalBox.setText(""+MMController.myOrder.getSubtotal());
		TaxBox.setText(""+MMController.myOrder.getSalesTax());	
		TotalBox.setText(""+MMController.myOrder.getTotal());	
	}
	
	@FXML
	private void removeItem() {
		String badItem = this.TextArea.getSelectionModel().getSelectedItem();
		MMController.myOrder.remove(badItem);
		update();
	}
	
	@FXML
	private void placeMyOrder() {
		if (MMController.myOrder != null) {
			
			
			Alert confirmation = new Alert(AlertType.INFORMATION);
			confirmation.setTitle("Confirmation");
			confirmation.setHeaderText("Confirmation");
			confirmation.setContentText("Order has been placed");
			confirmation.show();
			
			
			
			MMController.myStore.add(MMController.myOrder);
			MMController.myOrder = new Order();
			
			
			
		}
		update();
		Stage stage = (Stage) this.PlaceOrderButton.getScene().getWindow();     // do what you have to do     
		stage.close();
	}
	
	
}
