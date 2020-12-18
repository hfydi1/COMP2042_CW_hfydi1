package p4_group_8_repo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		SceneManager sm = new SceneManager(primaryStage);
		sm.openMainMenu();
	}
}
