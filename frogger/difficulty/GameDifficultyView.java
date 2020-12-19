package frogger.difficulty;

import frogger.actor.BackgroundImage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Displays everything in the game difficulty scene.
 * 
 * @author daudho
 *
 */
public class GameDifficultyView {
	public GameDifficultyView() {
		
	}
	
	/**
	 * Get parameters to create an gamedifficultyscene.
	 * @param stage end game scene stage.
	 * @param group end game scene group.
	 * @param endgamescene end game scene.
	 * @param goToMainMenuButton button to go back to main menu.
	 */
	public void gamedifficultyscene(Stage stage, Group group, Scene gamedifficultyscene, Button easyButton, Button normalButton, Button hardButton, Button playButton) {
		
		group.getChildren().add(new BackgroundImage("file:src/assets/img/scene/difficultyscene.png"));
		
		//Easy Button
		easyButton.setLayoutX(460);
		easyButton.setLayoutY(200);	
		easyButton.setMinWidth(100);
		easyButton.setMinHeight(40);
		
		//Normal Button
		normalButton.setLayoutX(460);
		normalButton.setLayoutY(300);	
		normalButton.setMinWidth(100);
		normalButton.setMinHeight(40);
		
		//Hard Button
		hardButton.setLayoutX(460);
		hardButton.setLayoutY(400);	
		hardButton.setMinWidth(100);
		hardButton.setMinHeight(40);
		
		//Play Button
		playButton.setLayoutX(460);
		playButton.setLayoutY(500);	
		playButton.setMinWidth(100);
		playButton.setMinHeight(40);
		
		group.getChildren().addAll(easyButton, normalButton, hardButton, playButton);
		
		stage.setScene(gamedifficultyscene);
		stage.setTitle("Frogger Game");
		stage.setResizable(false);
		stage.show();
	}
}
