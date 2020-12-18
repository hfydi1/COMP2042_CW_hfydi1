package frogger.endgame;

import frogger.actor.BackgroundImage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Displays everything in the end game scene.
 * 
 * @author daudho
 *
 */
public class EndGameView {
	public EndGameView() {
		
	}
	
	/**
	 * Get parameters to create an endgamescene.
	 * @param stage end game scene stage.
	 * @param group end game scene group.
	 * @param endgamescene end game scene.
	 * @param goToMainMenuButton button to go back to main menu.
	 */
	public void endgamescene(Stage stage, Group group, Scene endgamescene, Button goToMainMenuButton) {
		
		group.getChildren().add(new BackgroundImage("file:src/assets/img/endscene.png"));
		
		//Back to Main Menu button
		goToMainMenuButton.setLayoutX(460);
		goToMainMenuButton.setLayoutY(735);	
		goToMainMenuButton.setMinWidth(100);
		goToMainMenuButton.setMinHeight(40);
		
		group.getChildren().addAll(goToMainMenuButton);
		
		stage.setScene(endgamescene);
		stage.setTitle("Frogger Game");
		stage.setResizable(false);
		stage.show();
	}
}
