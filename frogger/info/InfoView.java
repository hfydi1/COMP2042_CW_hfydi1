package frogger.info;

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
public class InfoView {
	public InfoView() {
		
	}
	
	/**
	 * Get parameters to create a game info scene.
	 * @param stage game info scene stage.
	 * @param group game info scene group.
	 * @param infoscene game info scene.
	 * @param backButton button to go back to main menu.
	 */
	public void infoscene(Stage stage, Group group, Scene infoscene, Button backButton) {
		
		group.getChildren().add(new BackgroundImage("file:src/assets/img/info.png"));
		
		//Play Game button
		backButton.setLayoutX(460);
		backButton.setLayoutY(735);	
		backButton.setMinWidth(100);
		backButton.setMinHeight(40);
		
		group.getChildren().addAll(backButton);
		
		stage.setScene(infoscene);
		stage.setTitle("Frogger Game");
		stage.setResizable(false);
		stage.show();
	}
}
