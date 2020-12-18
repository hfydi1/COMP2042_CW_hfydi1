package frogger.info;

import p4_group_8_repo.*;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InfoController {
	private InfoView view;
	private InfoModel model;
	
	public InfoController(InfoView view, InfoModel model) {
		this.view = view;
		this.model = model;
	}
	
	public void runInfoScene() throws Exception {
		view.infoscene(model.getStage(), model.getGroup(), model.getScene(), model.getBackButton());
		model.setBackButton(model.getBackButton());
	}
}
