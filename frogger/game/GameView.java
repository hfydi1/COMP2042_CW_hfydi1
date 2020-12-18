package frogger.game;

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
import p4_group_8_repo.Animal;
import p4_group_8_repo.BackgroundImage;
import p4_group_8_repo.Difficulty;
import p4_group_8_repo.Digit;
import p4_group_8_repo.End;
import p4_group_8_repo.Log;
import p4_group_8_repo.MyStage;
import p4_group_8_repo.Turtle;
import p4_group_8_repo.WetTurtle;

public class GameView {
	
	public void start(Stage primaryStage, MyStage background, Scene Game, Animal animal) {
		
		//Difficulty speed modifier
				Difficulty game = new Difficulty();
				double logSpeed1 = game.getLogSpeed1();
				double logSpeed2 = game.getLogSpeed2();
				int turtleSpeed = game.getTurtleSpeed();
				double obstacleSpeed = game.getObstacleSpeed();
				
				
	BackgroundImage froggerback = new BackgroundImage("file:src/assets/img/bgtest.png");
    
	background.add(froggerback);
	
	background.add(new Log("file:src/assets/img/log3.png", 150, 0, 166, logSpeed1));
	background.add(new Log("file:src/assets/img/log3.png", 150, 220, 166, logSpeed1));
	background.add(new Log("file:src/assets/img/log3.png", 150, 440, 166, logSpeed1));
	background.add(new Log("file:src/assets/img/logs.png", 300, 0, 276, logSpeed2));
	background.add(new Log("file:src/assets/img/logs.png", 300, 400, 276, logSpeed2));
	background.add(new Log("file:src/assets/img/log3.png", 150, 50, 329, logSpeed1));
	background.add(new Log("file:src/assets/img/log3.png", 150, 270, 329, logSpeed1));
	background.add(new Log("file:src/assets/img/log3.png", 150, 490, 329, logSpeed1));
	
	background.add(new Turtle(500, 376, turtleSpeed, 130, 130));
	background.add(new Turtle(300, 376, turtleSpeed, 130, 130));
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
	
	background.add(animal);/*
	background.add(new Obstacle("file:src/assets/img/truck1Right.png", 0, 649, 0.5, 120, 120));
	background.add(new Obstacle("file:src/assets/img/truck1Right.png", 300, 649, 0.5, 120, 120));
	background.add(new Obstacle("file:src/assets/img/truck1Right.png", 600, 649, 0.5, 120, 120));
	
	background.add(new Obstacle("file:src/assets/img/car1Left.png", 100, 597, -0.5, 50, 50));
	background.add(new Obstacle("file:src/assets/img/car1Left.png", 250, 597, -0.5, 50, 50));
	background.add(new Obstacle("file:src/assets/img/car1Left.png", 400, 597, -0.5, 50, 50));
	background.add(new Obstacle("file:src/assets/img/car1Left.png", 550, 597, -0.5, 50, 50));
	background.add(new Obstacle("file:src/assets/img/truck2Right.png", 0, 540, 0.5, 200, 200));
	background.add(new Obstacle("file:src/assets/img/truck2Right.png", 500, 540, 0.5, 200, 200));
	background.add(new Obstacle("file:src/assets/img/car1Left.png", 500, 490, -1, 50, 50));*/
	background.add(new Digit(0, 30, 540, 25));
	background.start();

	}
}
