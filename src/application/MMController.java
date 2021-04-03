package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import application.orderDonutController;

public class MMController {
	@FXML
	private ImageView mmDonutImage;

	// Event Listener on ImageView[#mmDonutImage].onMouseClicked
	@FXML
	public void openDonutPage(MouseEvent event) {
		try {
		    FXMLLoader fxmlLoader = new FXMLLoader(orderDonutController.class.getResource("Ordering Donuts.fxml"));
		    Parent root1 = (Parent) fxmlLoader.load();
		    Stage stage = new Stage();
		    stage.initModality(Modality.APPLICATION_MODAL);
		    stage.initStyle(StageStyle.UNDECORATED);
		    stage.setTitle("Donut Menu");
		    stage.setScene(new Scene(root1));  
		    stage.show();
		}
		catch (Exception e) {
			System.out.println("EXCEPTION GENT");
		}
	}
}
