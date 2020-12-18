package frogger.info;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import p4_group_8_repo.SceneManager;
/**
 * Model for the game info scene.
 * 
 * @author daudho
 *
 */
public class InfoModel {
	private Scene infoscene;
	private Stage stage;
	private Group group;
	private Button backButton;
	private SceneManager sm;
	
	/**
	 * Construct of EndGameModel that takes in primaryStage as parameter.
	 * @param stage
	 */
	public InfoModel(Stage stage) {
		this.stage = stage;
		group = new Group();
		infoscene = new Scene(group,600,800);
		backButton = new Button("Back");
		sm = new SceneManager(stage);
	}


	//Setters and getters
	/**
	 * Set scene
	 * @param scene
	 */
	public void setScene(Scene scene) {
		infoscene = scene;
	}
	
	/**
	 * 
	 * @return a scene
	 */
	public Scene getScene() {
		return infoscene;
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
	public Group getGroup() {
		return group;
	}
	
	
	/*
	 * Set a back button to go back to the Main Menu.
	 * @param backButton
	 */
	public void setBackButton(Button backButton) {
		backButton.setOnAction(e -> {
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
	public Button getBackButton() {
		return backButton;
	}
	
}
