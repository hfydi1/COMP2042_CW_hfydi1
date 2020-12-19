package frogger.mainmenu;

/**
 * Controller for main menu scene.
 * 
 * @author daudho
 *
 */
public class MainMenuController {
	private MainMenuView view;
	private MainMenuModel model;
	
	/**
	 * Construct for a controller that takes in model and view parameters
	 * @param view takes the MainMenuView
	 * @param model takes the MainMenuModel
	 */
	public MainMenuController(MainMenuView view, MainMenuModel model){
		this.view = view;
		this.model = model;
	}
	
	/**
	 * Used in SceneManager class to get the main menu scene.
	 * @throws Exception
	 */
	public void runMainMenu() throws Exception {
		view.menu(model.getStage(), model.getGroup(), model.getScene(), model.getPlayButton(), model.getDifficultyButton(), model.getGameInfoButton());
		model.setPlayButton(model.getPlayButton());
		model.setDifficultyButton(model.getDifficultyButton());
		model.setGameInfoButton(model.getGameInfoButton());
	}
}
