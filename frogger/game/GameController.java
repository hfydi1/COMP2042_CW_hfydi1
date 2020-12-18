package frogger.game;

public class GameController {
	private GameView view;
	private GameModel model;
	
	public GameController(GameView view, GameModel model){
		this.view = view;
		this.model = model;
	}
	
	public void StartGame() throws Exception {
		view.start(model.getStage(), model.getBackground(), model.getGame(), model.getAnimal());
		model.start();
	}
	
}
