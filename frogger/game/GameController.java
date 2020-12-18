package frogger.game;

public class GameController {
	private GameView gameview;
	private GameModel gamemodel;
	
	public GameController(GameView gameview, GameModel gamemodel){
		this.gameview = gameview;
		this.gamemodel = gamemodel;
	}
	
	public void StartGame() throws Exception {
		gameview.start(gamemodel.getStage(), gamemodel.getBackground(), gamemodel.getGame(), gamemodel.getAnimal());
		gamemodel.start();
	}
	
}
