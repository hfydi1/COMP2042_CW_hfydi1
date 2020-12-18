package frogger.actor;

import javafx.scene.image.Image;

/**
 * Responsible for ending the game and displaying the frog successfully entering the cave.
 * 
 * @author daudho
 *
 */
public class End extends Actor{
	boolean activated = false;
	
	/**
	 * Starts animationTimer
	 */
	@Override
	public void act(long now) {
		
	}
	
	
	/**
	 * Create a cave for the frog to enter by getting the x-axis and y-axis of the scene.
	 * @param x x-axis to place cave.
	 * @param y y-axis to place cave.
	 */
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:src/assets/img/End.png", 60, 60, true, true));
	}
	
	/**
	 * To show frog successfully entering the cave.
	 */
	public void setEnd() {
		setImage(new Image("file:src/assets/img/FrogEnd.png", 70, 70, true, true));
		activated = true;
	}
	
	
	/**
	 * 
	 * @return True when the frog enters the cave.
	 */
	public boolean isActivated() {
		return activated;
	}
	

}
