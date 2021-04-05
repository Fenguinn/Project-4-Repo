package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;

import javafx.scene.control.ComboBox;

public class StoreOrdersController {
	private static final int ONE = 1;
	
	@FXML
	private TextArea TextArea;
	@FXML
	private Button CancelOrderButton;
	@FXML
	private Button ExportButton;
	@FXML
	private TextField TotalBox;
	@FXML
	private ComboBox<Integer> OrderNumberBoxs;
	
	@FXML
	private void initialize () {
		for (int x =0; x < MMController.myStore.getSize(); x++) {
			this.OrderNumberBoxs.getItems().add(x+1);
		}
		if (OrderNumberBoxs.getItems().isEmpty()) {
			return;
		}
		this.OrderNumberBoxs.setValue(ONE);
		
		this.update();
	}
	
	private void update() {
		if (OrderNumberBoxs.getItems().isEmpty()) {
			return;
		}
		int num = this.OrderNumberBoxs.getValue() - 1;
		
		this.TextArea.setText(MMController.myStore.getOrder(num).toString());
		this.TotalBox.setText(MMController.myStore.getOrder(num).getTotal());
		
	}
	
	@FXML
	private void cancelThisOrder() {
		try {
		int num = this.OrderNumberBoxs.getValue() - 1;
		this.OrderNumberBoxs.getItems().remove(MMController.myStore.getSize()-ONE);
		MMController.myStore.remove(MMController.myStore.getOrder(num));
		
		
		if (this.OrderNumberBoxs.getItems().isEmpty()) {
			this.TextArea.clear();
			this.TotalBox.clear();
		}
		
		this.update();
		}
		catch (Exception e) {
			
		}
	}
	
	@FXML 
	private void handleOrder(ActionEvent e) {
		this.update();
	}
	
	@FXML
	private void exportOrder(ActionEvent e) {
		if (MMController.myStore.getSize() <= 0){
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("WARNING");
			alert.setContentText("You have no orders");
			alert.show();
			return;
		}
		MMController.myStore.exportDatabase();
	}
	
	
	
}
