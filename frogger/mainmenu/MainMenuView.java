package frogger.mainmenu;

import frogger.actor.BackgroundImage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainMenuView {
	public MainMenuView() {
		
	}
	
	public void menu(Stage stage, Group group, Scene menu, Button playButton, Button gameInfoButton) throws Exception {
		
		group.getChildren().add(new BackgroundImage("file:src/assets/img/bgtest.png"));
				
		//Play Game button
		playButton.setLayoutX(100);
		playButton.setLayoutY(200);
		
		//Game Info button
		gameInfoButton.setLayoutX(245);
		gameInfoButton.setLayoutY(550);
		
		group.getChildren().addAll(playButton,gameInfoButton);
		
		stage.setScene(menu);
		stage.setTitle("Frogger Game");
		stage.setResizable(false);
		stage.show();
	}
}

