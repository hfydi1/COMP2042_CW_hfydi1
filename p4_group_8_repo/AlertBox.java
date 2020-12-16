package p4_group_8_repo;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {
	
	public static void display(String title, String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL); //blocks interactions until confirmation by user
		window.setTitle(title);
		window.setMinWidth(400);
		window.setMinHeight(200);
		
		Label label = new Label();
		label.setText(message);
		Button closeButton = new Button("Close the window");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(20);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait(); //user must close before going to other scene
	}
}
