package frogger.difficulty;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import p4_group_8_repo.SceneManager;

/**
 * Model for the game difficulty scene.
 * 
 * @author daudho
 *
 */
public class GameDifficultyModel {
	private Scene gamedifficultyscene;
	private Stage stage;
	private Group group;
	private Button easyButton, normalButton, hardButton, playButton;
	private SceneManager sm;
	private int choice, diff;
	
	/**
	 * Construct of GameDifficultyModel that takes in primaryStage as parameter.
	 * @param stage
	 */
	public GameDifficultyModel(Stage stage) {
		this.stage = stage;
		group = new Group();
		gamedifficultyscene = new Scene(group,600,800);
		easyButton = new Button("EASY");
		normalButton = new Button("NORMAL");
		hardButton = new Button("HARD");
		playButton = new Button("Play Game");
		sm = new SceneManager(stage);
	}
	
	public GameDifficultyModel() {
		choice = diff;
	}
	
	//Setters and getters
	/**
	 * Set scene
	 * @param scene
	 */
	public void setScene(Scene scene) {
		gamedifficultyscene = scene;
	}
	
	/**
	 * 
	 * @return a scene
	 */
	public Scene getScene() {
		return gamedifficultyscene;
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
	 * @return group
	 */
	public Group getGroup() {
		return group;
	}
	
	/**
	 * Set a easy button to set game difficulty to easy.
	 * @param easyButton
	 */
	public void setEasyButton(Button easyButton) {
		easyButton.setOnAction(e -> {
			try {
				diff = 1;
				Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Difficulty Changed!");
	    		alert.setHeaderText("Difficulty set to EASY");
	    		alert.setContentText("Other difficulty available: NORMAL and HARD");
	    		alert.show();
	    		sm.openGameScene();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	/**
	 * 
	 * @return a button.
	 */
	public Button getEasyButton() {
		return easyButton;
	}
	
	/**
	 * Set a normal button to set game difficulty to easy.
	 * @param normalButton
	 */
	public void setNormalButton(Button normalButton) {
		normalButton.setOnAction(e -> {
			try {
				diff = 2;
				Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Difficulty Changed!");
	    		alert.setHeaderText("Difficulty set to NORMAL");
	    		alert.setContentText("Other difficulty available: EASY and HARD");
	    		alert.show();
	    		sm.openGameScene();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	/**
	 * 
	 * @return a button.
	 */
	public Button getNormalButton() {
		return normalButton;
	}
	
	/**
	 * Set a hard button to set game difficulty to easy.
	 * @param hardButton
	 */
	public void setHardButton(Button hardButton) {
		hardButton.setOnAction(e -> {
			try {
				diff = 3;
				Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Difficulty Changed!");
	    		alert.setHeaderText("Difficulty set to HARD");
	    		alert.setContentText("Other difficulty available: EASY and NORMAL");
	    		alert.show();
	    		sm.openGameScene();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	/**
	 * 
	 * @return a button.
	 */
	public Button getHardButton() {
		return hardButton;
	}
	
	/**
	 * Set a normal button to set game difficulty to easy.
	 * @param normalButton
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
	 * @return a button.
	 */
	public Button getPlayButton() {
		return playButton;
	}
	
	/**
	 * Set difficulty modifier
	 */
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	/**
	 * @return an integer
	 */
	public int getChoice() {
		return this.choice;
	}
}
