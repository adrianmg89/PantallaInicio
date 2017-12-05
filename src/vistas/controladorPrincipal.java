package vistas;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class controladorPrincipal {

	@FXML
	public void cerrarPantalla() {
		System.exit(0);
	}

	@FXML
	public void cambioSecundaria() {
		cambiarPantallaSecundaria();
	}

	public void cambiarPantallaSecundaria() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../vistas/Secundaria.fxml"));
			AnchorPane panel = (AnchorPane) loader.load();
			Stage scena = new Stage();
			scena.initStyle(StageStyle.UNDECORATED);
			Scene escena = new Scene(panel);
			scena.setScene(escena);
			scena.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
