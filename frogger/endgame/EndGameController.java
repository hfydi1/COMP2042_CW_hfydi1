package frogger.endgame;
/**
 * Controller for the end game scene.
 * 
 * @author daudho
 *
 */
public class EndGameController {
	private EndGameView view;
	private EndGameModel model;
	
	/**
	 * Construct for a controller that takes in model and view parameters.
	 * @param view takes the EndGameView.
	 * @param model takes the EndGameModel.
	 */
	public EndGameController(EndGameView view, EndGameModel model) {
		this.view = view;
		this.model = model;
	}
	
	/**
	 * Used in SceneManager.java to get the end game scene.
	 * @throws Exception
	 */
	public void runEndGameScene() throws Exception {
		view.endgamescene(model.getStage(), model.getGroup(), model.getScene(), model.getGoToMainMenuButton());
		model.setGoToMainMenuButton(model.getGoToMainMenuButton());
	}
}
