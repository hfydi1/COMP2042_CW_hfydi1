package frogger.mainmenu;

import p4_group_8_repo.*;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainMenuModel {
	private Scene menu;
	private Stage stage;
	private Group group;
	private Button playButton, difficultyButton, gameInfoButton;
	private SceneManager sm;
	
	public MainMenuModel(Stage stage) {
		this.stage = stage;
		group = new Group();
		menu = new Scene(group, 600, 800);
		playButton = new Button("Play");
		difficultyButton = new Button("Change Difficulty");
		gameInfoButton = new Button("Game Info");
		sm = new SceneManager(stage);
	}
	
	
	//Setters and getters
	public void setScene(Scene scene) {
		menu = scene;
	}
	
	public Scene getScene() {
		return menu;
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	public Stage getStage() {
		return stage;
	}
	
	public void setGroup(Group group) {
		this.group = group;
	}
	
	public Group getGroup(){
		return group;
	}
	
	
	//Buttons
	public void setPlayButton(Button playButton) {
		playButton.setOnAction(e -> {
			try {
				sm.openGameScene();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	public Button getPlayButton() {
		return playButton;
	}
	
	public void setDifficultyButton(Button difficultyButton) {
		difficultyButton.setOnAction(e -> {
			try {
				sm.openDifficultyScene();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	public Button getDifficultyButton() {
		return difficultyButton;
	}
	
	public void setGameInfoButton(Button gameInfoButton) {
		gameInfoButton.setOnAction(e -> {
			try {
				sm.openInfoScene();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	public Button getGameInfoButton() {
		return gameInfoButton;
	}
	
}
