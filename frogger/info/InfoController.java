package frogger.info;

/**
 * Controller for the game info scene.
 * 
 * @author daudho
 *
 */
public class InfoController {
	private InfoView view;
	private InfoModel model;
	
	/**
	 * Construct for a controller that takes in model and view parameters.
	 * @param view takes the InfoView.
	 * @param model takes the InfoModel.
	 */
	public InfoController(InfoView view, InfoModel model) {
		this.view = view;
		this.model = model;
	}
	
	/**
	 * Used in SceneManager.java to get the end game scene.
	 * @throws Exception
	 */
	public void runInfoScene() throws Exception {
		view.infoscene(model.getStage(), model.getGroup(), model.getScene(), model.getBackButton());
		model.setBackButton(model.getBackButton());
	}
}
