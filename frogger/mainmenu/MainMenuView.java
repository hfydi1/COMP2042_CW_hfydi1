package frogger.mainmenu;

import frogger.actor.BackgroundImage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuView {
	public MainMenuView() {
		
	}
	
	public void menu(Stage stage, Group group, Scene menu, Button playButton, Button difficultyButton, Button gameInfoButton) throws Exception {
		
		group.getChildren().add(new BackgroundImage("file:src/assets/img/scene/mainmenuscene.png"));
				
		//Play Game button
		playButton.setLayoutX(225);
		playButton.setLayoutY(350);
		playButton.setMinWidth(150);
		playButton.setMinHeight(70);
		
		//Game Difficulty button
		difficultyButton.setLayoutX(225);
		difficultyButton.setLayoutY(450);
		difficultyButton.setMinWidth(150);
		difficultyButton.setMinHeight(70);
		
		//Game Info button
		gameInfoButton.setLayoutX(225);
		gameInfoButton.setLayoutY(550);
		gameInfoButton.setMinWidth(150);
		gameInfoButton.setMinHeight(70);
		
		group.getChildren().addAll(playButton, difficultyButton, gameInfoButton);
		
		stage.setScene(menu);
		stage.setTitle("Frogger Game");
		stage.setResizable(false);
		stage.show();
	}
}

