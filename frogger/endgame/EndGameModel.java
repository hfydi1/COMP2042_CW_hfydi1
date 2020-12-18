package frogger.endgame;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import p4_group_8_repo.SceneManager;

/**
 * Model for the end game scene.
 * 
 * @author daudho
 *
 */
public class EndGameModel {
	private Scene endgamescene;
	private Stage stage;
	private Group group;
	private Button goToMainMenuButton;
	private SceneManager sm;
	
	/**
	 * Construct of EndGameModel that takes in primaryStage as parameter.
	 * @param stage
	 */
	public EndGameModel(Stage stage) {
		this.stage = stage;
		group = new Group();
		endgamescene = new Scene(group,600,800);
		goToMainMenuButton = new Button("Back to Main Menu");
		sm = new SceneManager(stage);
	}
	
	//Setters and getters
	/**
	 * Set scene
	 * @param scene
	 */
	public void setScene(Scene scene) {
		endgamescene = scene;
	}
	
	/**
	 * 
	 * @return a scene
	 */
	public Scene getScene() {
		return endgamescene;
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
	 * Set a back button to go back to the Main Menu.
	 * @param goToMainMenuButton
	 */
	public void setGoToMainMenuButton(Button goToMainMenuButton) {
		goToMainMenuButton.setOnAction(e -> {
			try {
				sm.openMainMenu();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	/**
	 * 
	 * @return a button.
	 */
	public Button getGoToMainMenuButton() {
		return goToMainMenuButton;
	}
	
}
