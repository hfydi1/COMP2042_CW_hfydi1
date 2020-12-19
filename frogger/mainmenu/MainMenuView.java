package frogger.mainmenu;

import frogger.actor.BackgroundImage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 * Displays everything in the main menu scene.
 * 
 * @author daudho
 *
 */
public class MainMenuView {
	public MainMenuView() {
		
	}
	
	/**
	 * Get parameters to create menu
	 * @param stage menu stage
	 * @param group menu group
	 * @param menu scene
	 * @param playButton button to play the game
	 * @param difficultyButton button to change game difficulty
	 * @param gameInfoButton button to check game info
	 * @throws Exception
	 */
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

