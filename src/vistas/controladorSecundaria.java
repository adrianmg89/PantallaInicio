package vistas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class controladorSecundaria implements Initializable{
	Stage stage;
	@FXML
	Button botonSalir;
	@FXML
	private MediaView pantallaVideo;

	@FXML
	public void cerrarVentana(){
		Stage stage = (Stage) botonSalir.getScene().getWindow();
		stage.close();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Media video = new Media(getClass().getResource("video/one_punch.mp4").toExternalForm());
		MediaPlayer play = new MediaPlayer(video);
		pantallaVideo.setMediaPlayer(play);
		play.setVolume(0);
		play.play();
	}

}
