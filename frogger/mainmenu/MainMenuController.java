package frogger.mainmenu;

public class MainMenuController {
	private MainMenuView view;
	private MainMenuModel model;
	
	public MainMenuController(MainMenuView view, MainMenuModel model){
		this.view = view;
		this.model = model;
	}
	
	public void runMainMenu() throws Exception {
		view.menu(model.getStage(), model.getGroup(), model.getScene(), model.getPlayButton(), model.getGameInfoButton());
		model.setPlayButton(model.getPlayButton());
		model.setGameInfoButton(model.getGameInfoButton());
	
	}
}
