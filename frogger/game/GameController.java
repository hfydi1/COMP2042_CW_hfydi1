package frogger.game;

/**
 * Controller for the game scene.
 * 
 * @author daudho
 *
 */
public class GameController {
	private GameView view;
	private GameModel model;
	
	/**
	 * Construct for a controller that takes in model and view parameters.
	 * @param view takes the GameView.
	 * @param model takes the GameModel.
	 */
	public GameController(GameView view, GameModel model){
		this.view = view;
		this.model = model;
	}
	
	/**
	 * Used in SceneManager.java to get the game scene.
	 * @throws Exception
	 */
	public void StartGame() throws Exception {
		view.start(model.getStage(), model.getBackground(), model.getGame(), model.getAnimal());
		model.start();
	}
	
}
