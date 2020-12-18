package frogger.game;

import frogger.actor.Animal;
import frogger.actor.Digit;
import frogger.world.MyStage;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class GameModel {
	
	private Stage primaryStage;
	private Scene Game;
	private MyStage background;
	private Animal animal;
	
	AnimationTimer timer;
    
    public GameModel(Stage stage){
    	this.primaryStage = stage;
    	background = new MyStage();
    	Game = new Scene(background, 600, 800);
    	animal = new Animal("file:src/assets/img/froggerUp.png");
    }
    
	public Stage getStage() {
		return primaryStage;
	}
	public void setStage(Stage stage) {
		this.primaryStage = stage;
	}
	public Scene getGame() {
		return Game;
	}
	public void setGame(Scene game) {
		Game = game;
	}
	public MyStage getBackground() {
		return background;
	}
	public void setBackground(MyStage background) {
		this.background = background;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		System.out.print("STOP:");
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
		primaryStage.setScene(Game);
		primaryStage.show();
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
    		  background.add(new Digit(k, 30, 540 - shift, 25));
    		  shift+=30;
    		}
    }
    
}
