package frogger.game;

import java.io.IOException;

import frogger.actor.Animal;
import frogger.actor.Digit;
import frogger.world.MyStage;
import frogger.hiscore.*;
import p4_group_8_repo.*;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Model for the game scene.
 * 
 * @author daudho
 *
 */
public class GameModel {
	
	private Stage primaryStage;
	private Scene Game;
	private MyStage background;
	private Animal animal;
	private SceneManager sm;
	Highscore highscore;
	AnimationTimer timer;
    
	/**
	 * Construct of GameModel that takes in primaryStage as parameter.
	 * @param stage primaryStage
	 */
    public GameModel(Stage stage){
    	this.primaryStage = stage;
    	background = new MyStage();
    	Game = new Scene(background, 600, 800);
    	animal = new Animal("file:src/assets/img/froggerUp.png");
    	this.highscore = new Highscore();
    	sm = new SceneManager(stage);
    }
    
    
    /**
     *
     * @return a stage
     */
	public Stage getStage() {
		return primaryStage;
	}
	
	/**
	 * Set a stage
	 * @param primaryStage
	 */
	public void setStage(Stage stage) {
		this.primaryStage = stage;
	}
	
	/**
	 * 
	 * @return game
	 */
	public Scene getGame() {
		return Game;
	}
	
	/**
	 * Set game scene.
	 * @param game scene
	 */
	public void setGame(Scene game) {
		Game = game;
	}
	
	/**
	 * 
	 * @return background
	 */
	public MyStage getBackground() {
		return background;
	}
	
	/**
	 * Set a background
	 * @param background
	 */
	public void setBackground(MyStage background) {
		this.background = background;
	}
	
	/**
	 * 
	 * @return an animal
	 */
	public Animal getAnimal() {
		return animal;
	}
	
	/**
	 * Set animal
	 * @param animal
	 */
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	 public void stop() {
	       timer.stop();
	   }
	
	/**
	 * Constantly tracks the game score and display the score at the end of the game.
	 */
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
            		try {
            			highscore.setScore(animal.getPoints());
            		} catch (IOException e) {
            			e.printStackTrace();
            		}
            		highscore.getScore(); //shows alert
            		try {
            			sm.openEndGameScene();
            		} catch (Exception e){
            			e.printStackTrace();
            		}

            	}
            }
        };
    }
	
	/**
	 * Start game timer.
	 */
	public void start() {
		primaryStage.setScene(Game);
		primaryStage.show();
		primaryStage.setResizable(false); //user wont be allowed to resize window
		background.playMusic();
    	createTimer();
        timer.start();
    }
	
    /**
     * To change the score x-axis and y-axis as the numbers increase.
     * @param n digit of number
     */
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
