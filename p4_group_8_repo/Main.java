package p4_group_8_repo;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	/**
	 * Start program
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Runs program with Main Menu as first scene
	 * 
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		SceneManager sm = new SceneManager(primaryStage);
		sm.openMainMenu();
	}
}
