package frogger.info;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import p4_group_8_repo.SceneManager;

public class InfoModel {
	private Scene infoscene;
	private Stage stage;
	private Group group;
	private Button backButton;
	private SceneManager sm;
	
	public InfoModel(Stage stage) {
		this.stage = stage;
		group = new Group();
		infoscene = new Scene(group,600,800);
		backButton = new Button("Back");
		sm = new SceneManager(stage);
	}


	//Setters and getters
	public void setScene(Scene scene) {
		infoscene = scene;
	}
	
	public Scene getScene() {
		return infoscene;
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
	
	public Group getGroup() {
		return group;
	}
	
	//Buttons
	public void setBackButton(Button backButton) {
		backButton.setOnAction(e -> {
			try {
				sm.openMainMenu();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
	
	public Button getBackButton() {
		return backButton;
	}
	
}
