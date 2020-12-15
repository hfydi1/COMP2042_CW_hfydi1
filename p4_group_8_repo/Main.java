package p4_group_8_repo;

import java.io.File;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	
	Stage window;
	Scene Menu, Game;
	
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		
		//Button 1
		Label label1 = new Label("Welcome to Frogger Game");
		Button button1 = new Button("Go to game");
		button1.setOnAction(e -> window.setScene(Game));
		
		//Main Menu layout
		VBox mainMenu = new VBox(50);
		mainMenu.getChildren().addAll(label1, button1);
		Menu = new Scene(mainMenu, 600, 800);
		
		//Game layout
		background = new MyStage();
	    Game  = new Scene(background,600,800);
	    
	    window.setScene(Menu);
	    window.setTitle("Frogger Game");
		window.show();
		
		BackgroundImage froggerback = new BackgroundImage("file:src/assets/img/bgtest.png");
	    
		background.add(froggerback);
		
		background.add(new Log("file:src/assets/img/log3.png", 150, 0, 166, 0.2));
		background.add(new Log("file:src/assets/img/log3.png", 150, 220, 166, 0.2));
		background.add(new Log("file:src/assets/img/log3.png", 150, 440, 166, 0.2));
		background.add(new Log("file:src/assets/img/logs.png", 300, 0, 276, -1));
		background.add(new Log("file:src/assets/img/logs.png", 300, 400, 276, -1));
		background.add(new Log("file:src/assets/img/log3.png", 150, 50, 329, 0.2));
		background.add(new Log("file:src/assets/img/log3.png", 150, 270, 329, 0.2));
		background.add(new Log("file:src/assets/img/log3.png", 150, 490, 329, 0.2));
		
		background.add(new Turtle(500, 376, -1, 130, 130));
		background.add(new Turtle(300, 376, -1, 130, 130));
		background.add(new WetTurtle(700, 376, -1, 130, 130));
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));

		background.add(new End(13, 96)); // End represent the boxes at the end of the map
        background.add(new End(141, 96));
        background.add(new End(269, 96));
        background.add(new End(398, 96));
        background.add(new End(528, 96));
		
		animal = new Animal("file:src/assets/img/froggerUp.png");
		
		background.add(animal);
		background.add(new Obstacle("file:src/assets/img/truck1Right.png", 0, 649, 0.5, 120, 120));
		background.add(new Obstacle("file:src/assets/img/truck1Right.png", 300, 649, 0.5, 120, 120));
		background.add(new Obstacle("file:src/assets/img/truck1Right.png", 600, 649, 0.5, 120, 120));
		
		background.add(new Obstacle("file:src/assets/img/car1Left.png", 100, 597, -0.5, 50, 50));
		background.add(new Obstacle("file:src/assets/img/car1Left.png", 250, 597, -0.5, 50, 50));
		background.add(new Obstacle("file:src/assets/img/car1Left.png", 400, 597, -0.5, 50, 50));
		background.add(new Obstacle("file:src/assets/img/car1Left.png", 550, 597, -0.5, 50, 50));
		background.add(new Obstacle("file:src/assets/img/truck2Right.png", 0, 540, 0.5, 200, 200));
		background.add(new Obstacle("file:src/assets/img/truck2Right.png", 500, 540, 0.5, 200, 200));
		background.add(new Obstacle("file:src/assets/img/car1Left.png", 500, 490, -1, 50, 50));
		background.add(new Digit(0, 30, 360, 25));
		background.start();
		
		start();  
	}
	public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
            		alert.setContentText("Highest Possible Score: 800");
            		alert.show();
            	}
            }
        };
    }
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
    }

    public void stop() {
        timer.stop();
    }
    
    public void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		  int d = n / 10;
    		  int k = n - d * 10;
    		  n = d;
    		  background.add(new Digit(k, 30, 360 - shift, 25));
    		  shift+=30;
    		}
    }
}
