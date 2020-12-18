package p4_group_8_repo;

import java.io.File;
import java.util.List;

import frogger.actor.Animal;
import frogger.game.GameController;
import frogger.game.GameModel;
import frogger.game.GameView;
import frogger.world.MyStage;
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

public class Main extends Application {
	
	Stage mainWindow;
	Scene Menu, Difficulty;
	
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		mainWindow = primaryStage;
		
		//Buttons
		//Play Game Button 
		Label label1 = new Label("Welcome to Frogger Game!");
		Button button1 = new Button("Go to game");
		button1.setOnAction(e -> {
			GameModel gamemodel = new GameModel(mainWindow);
			GameView gameview = new GameView();
			GameController gamecontroller = new GameController(gameview, gamemodel);
			try {
				gamecontroller.StartGame();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		//Change Difficulty Button
		Label label2 = new Label("Change game difficulty:");
		Button button2 = new Button("Change");
		button2.setOnAction(e -> mainWindow.setScene(Difficulty));	
		
		//Change Difficulty Button (Easy)
		Label label3 = new Label("EASY");
		Button button3 = new Button("Change");
		button3.setOnAction(e -> AlertBox.display("Difficulty Changed!", "Game difficulty set to Easy."));		
		
		//Change Difficulty Button (Normal)
		Label label4 = new Label("NORMAL");
		Button button4 = new Button("Change");
		button4.setOnAction(e -> AlertBox.display("Difficulty Changed!", "Game difficulty set to Normal."));		
		
		//Change Difficulty Button (Hard)
		Label label5 = new Label("HARD");
		Button button5 = new Button("Change");
		button5.setOnAction(e -> AlertBox.display("Difficulty Changed!", "Game difficulty set to Hard."));	
		
		//Change Difficulty Button (Hard)
		Label label6 = new Label("PLAY GAME");
		Button button6 = new Button("PLAY");
		button6.setOnAction(e -> mainWindow.setScene(Difficulty));	
		
		//Scenes
		//Main Menu layout
		VBox mainMenu = new VBox(50);
		mainMenu.getChildren().addAll(label1, button1, label2, button2);
		Menu = new Scene(mainMenu, 600, 800);
		
		//Change difficulty layout
		VBox changeDifficulty = new VBox(50);
		changeDifficulty.getChildren().addAll(label3, button3, label4, button4, label5, button5, label6, button6);
		Difficulty = new Scene(changeDifficulty, 600, 800);
		
		//Game layout
	    //Game  = new Scene(background,600,800);
	    
	    mainWindow.setScene(Menu);
	    mainWindow.setTitle("Frogger Game");
		mainWindow.show();
		mainWindow.setResizable(false); //prevent user from resizing the game window that will introduce scaling errors
		
		//Difficulty speed modifier
		Difficulty game = new Difficulty();
		double logSpeed1 = game.getLogSpeed1();
		double logSpeed2 = game.getLogSpeed2();
		int turtleSpeed = game.getTurtleSpeed();
		double obstacleSpeed = game.getObstacleSpeed();
	

		
	}

}
