package frogger.mainmenu;

import p4_group_8_repo.*;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Model for the main menu scene
 * 
 * @author daudho
 *
 */
public class MainMenuModel {
	private Scene menu;
	private Stage stage;
	private Group group;
	private Button playButton, difficultyButton, gameInfoButton;
	private SceneManager sm;
	
	/**
	 * Construct of MainMenuModel that takes in primaryStage as parameter.
	 * @param stage
	 */
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
	/**
	 * Set scene
	 * @param scene
	 */
	public void setScene(Scene scene) {
		menu = scene;
	}
	
	/**
	 * 
	 * @return a scene
	 */
	public Scene getScene() {
		return menu;
	}
	
	/**
	 * Set stage
	 * @param stage
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	/**
	 * 
	 * @return a stage
	 */
	public Stage getStage() {
		return stage;
	}
	
	/**
	 * Set group
	 * @param group
	 */
	public void setGroup(Group group) {
		this.group = group;
	}
	
	
	/**
	 * 
	 * @return a group
	 */
	public Group getGroup(){
		return group;
	}
	
	
	//Buttons
	/**
	 * Set a play button to play the game.
	 * @param playButton
	 */
	public void setPlayButton(Button playButton) {
		playButton.setOnAction(e -> {
			try {
				sm.openGameScene();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	/**
	 * 
	 * @return a button
	 */
	public Button getPlayButton() {
		return playButton;
	}
	
	/**
	 * Set a difficulty button to go to difficulty scene.
	 * @param difficultyButton
	 */
	public void setDifficultyButton(Button difficultyButton) {
		difficultyButton.setOnAction(e -> {
			try {
				sm.openDifficultyScene();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	/**
	 * 
	 * @return a button
	 */
	public Button getDifficultyButton() {
		return difficultyButton;
	}
	
	/**
	 * Set a button to go to info scene.
	 * @param gameInfoButton
	 */
	public void setGameInfoButton(Button gameInfoButton) {
		gameInfoButton.setOnAction(e -> {
			try {
				sm.openInfoScene();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	/**
	 * 
	 * @return a button
	 */
	public Button getGameInfoButton() {
		return gameInfoButton;
	}
	
}
