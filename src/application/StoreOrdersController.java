package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

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
		this.OrderNumberBoxs.setValue(ONE);
		this.update();
	}
	
	private void update() {
		int num = this.OrderNumberBoxs.getValue() - 1;
		this.TextArea.setText(MMController.myStore.getOrder(num).toString());
		this.TotalBox.setText(MMController.myStore.getOrder(num).getTotal());
	}
	
	@FXML
	private void cancelThisOrder() {
		int num = this.OrderNumberBoxs.getValue() - 1;
		this.OrderNumberBoxs.getItems().remove(MMController.myStore.getSize()-ONE);
		MMController.myStore.remove(MMController.myStore.getOrder(num));
		this.update();
	}
	
	@FXML 
	private void handleOrder(ActionEvent e) {
		this.update();
	}
}
