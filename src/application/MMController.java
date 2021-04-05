package application;

import java.io.FileNotFoundException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MMController {
	
	public static Order myOrder = new Order();
	public static StoreOrders myStore = new StoreOrders();
	
	/**
	 * 
	 */
	@FXML
	public void initialize() {
		//myOrder = new Order();
	}
	
	@FXML
	private ImageView mmDonutImage;
	
	@FXML
	private ImageView YourOrderImage;
	
	@FXML
	private ImageView StoreOrders;

	// Event Listener on ImageView[#mmDonutImage].onMouseClicked
	@FXML
	public void openDonutPage(MouseEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ordering Donuts.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Donut Menu");
			stage.setScene(new Scene(root1));  
			stage.show();
		}
		catch (Exception e) {
			System.out.println("EXCEPTION GENT");
		}
	}
	
	// Event Listener on ImageView[#mmCoffeeImage].onMouseClicked
		@FXML
		public void openCoffeePage(MouseEvent event) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ordering Coffee.fxml"));
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Coffee Menu");
				stage.setScene(new Scene(root1));  
				stage.show();
			}
			catch (Exception e) {
				System.out.println("EXCEPTION GENT");
			}
		}
		
		
		// Event Listener on ImageView[#mmYourOrdersImage].onMouseClicked
		@FXML
		public void openYourOrdersPage(MouseEvent event) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Current order detail.fxml"));
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Your Orders");
				stage.setScene(new Scene(root1));  
				stage.show();
			}
			catch (Exception e) {
				System.out.println("EXCEPTION GENT1");
			}
		}
		
		// Event Listener on ImageView[#mmStoreOrdersImage].onMouseClicked
		@FXML
		public void openStoreOrdersPage(MouseEvent event) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Store orders page.fxml"));
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Store Orders");
				stage.setScene(new Scene(root1));  
				stage.show();
			}
			catch (Exception e) {
				System.out.println("EXCEPTION GENT");
			}
		}
	
	
}
