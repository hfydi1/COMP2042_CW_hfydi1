package frogger.game;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameController {
	private GameView gameview;
	private GameModel gamemodel;
	
	public GameController(GameView gameview, GameModel gamemodel){
		this.gameview = gameview;
		this.gamemodel = gamemodel;
	}
	
	public void StartGame() throws Exception {
		gameview.start(gamemodel.getStage(), gamemodel.getBackground(), gamemodel.getGame(), gamemodel.getAnimal());
		gamemodel.start();
	}
	
}
