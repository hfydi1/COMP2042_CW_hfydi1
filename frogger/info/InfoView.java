package frogger.info;

import frogger.actor.BackgroundImage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InfoView {
	public InfoView() {
		
	}
	
	public void infoscene(Stage stage, Group group, Scene infoscene, Button backButton) {
		
		group.getChildren().add(new BackgroundImage("file:src/assets/images/bgtest.png"));
		
		//Play Game button
		backButton.setLayoutX(230);
		backButton.setLayoutY(500);	
		
		group.getChildren().addAll(backButton);
		
		stage.setScene(infoscene);
		stage.setTitle("Frogger");
		stage.show();
	}
}
