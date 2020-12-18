package p4_group_8_repo;

import frogger.game.*;
import frogger.mainmenu.*;
import frogger.info.*;
import frogger.endgame.*;
import javafx.stage.Stage;

public class SceneManager {
	private Stage primaryStage;
	
	/**
	 * Construct of SceneManager that takes in primaryStage as parameter.
	 * @param primaryStage
	 */
	public SceneManager(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	/**
	 * Method to show mainmenu.
	 * @throws Exception
	 */
	public void openMainMenu() throws Exception {
		MainMenuView view = new MainMenuView();
		MainMenuModel model = new MainMenuModel(primaryStage);
		MainMenuController controller = new MainMenuController(view, model);
		controller.runMainMenu();
	}
	
	/**
	 * Method to show game scene.
	 * @throws Exception
	 */
	public void openGameScene() throws Exception {
		GameView view = new GameView();
		GameModel model = new GameModel(primaryStage);
		GameController controller = new GameController(view, model);
		controller.StartGame();
	}
	
	/**
	 * Method to show info scene.
	 * @throws Exception
	 */
	public void openInfoScene() throws Exception {
		InfoView view = new InfoView();
		InfoModel model = new InfoModel(primaryStage);
		InfoController controller = new InfoController(view, model);
		controller.runInfoScene();
	}
	
	/**
	 * Method to show end game scene.
	 * @throws Exception
	 */
	public void openEndGameScene() throws Exception {
		EndGameView view = new EndGameView();
		EndGameModel model = new EndGameModel(primaryStage);
		EndGameController controller = new EndGameController(view, model);
		controller.runEndGameScene();
	}
	
}
