package dad.javafx.fxml.CalculadoraFXML;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	// Controller
	CalculadoraFXMLController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		controller = new CalculadoraFXMLController();

		Scene scene = new Scene(controller.getView(), 400, 312);

		Stage stage = new Stage();

		stage.setTitle("CalculadoraFXML");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
