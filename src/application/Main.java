package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class Main extends Application {
	Stage stage;

	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			pantallaPrincipal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void pantallaPrincipal() {
		try {
			FXMLLoader carga = new FXMLLoader(getClass().getResource("../vistas/Principal.fxml"));
			AnchorPane panel = carga.load();

			Font.loadFont(getClass().getResourceAsStream("Recursos/fuentes/FunSized.ttf"),20);
			Font.loadFont(getClass().getResourceAsStream("Recursos/fuentes/KOMTXT__.ttf"),20);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(new Scene(panel));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
