package frogger.difficulty;

/**
 * Controller for the game difficulty scene.
 * 
 * @author daudho
 *
 */
public class GameDifficultyController {
	private GameDifficultyView view;
	private GameDifficultyModel model;
	
	/**
	 * Construct for a controller that takes in model and view parameters.
	 * @param view takes the GameDifficultyView.
	 * @param model takes the GameDifficultyModel.
	 */
	public GameDifficultyController(GameDifficultyView view, GameDifficultyModel model) {
		this.view = view;
		this.model = model;
	}
	
	/**
	 * Used in SceneManager.java to get the end game scene.
	 * @throws Exception
	 */
	public void runGameDifficultyScene() throws Exception {
		view.gamedifficultyscene(model.getStage(), model.getGroup(), model.getScene(), model.getEasyButton(), model.getNormalButton(), model.getHardButton(), model.getPlayButton());
		model.setEasyButton(model.getEasyButton());
		model.setNormalButton(model.getNormalButton());
		model.setHardButton(model.getHardButton());
		model.setPlayButton(model.getPlayButton());
	}
}