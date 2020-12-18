package frogger.actor;

import javafx.scene.image.Image;

/**
 * Responsible for the movement speed of the logs in the game scene.
 * Acts as stepping stone for the frog to cross the water safely.
 * 
 * @author daudho
 *
 */
public class Log extends Actor {

	private double speed;
	
	/**
	 * Gets now as parameter instead of act method to set the actual log position.
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX()>600 && speed>0)
			setX(-180);
		if (getX()<-300 && speed<0)
			setX(700);
	}
	
	/**
	 * Construct for log that takes in imageLink, size, x-axis, y-axis and log speed.
	 * @param imageLink link to images.
	 * @param size size of image.
	 * @param xpos x-axis of log on game scene.
	 * @param ypos y-axis of log on game scene.
	 * @param s speed of the log.
	 */
	public Log(String imageLink, int size, int xpos, int ypos, double s) {
		setImage(new Image(imageLink, size,size, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
	
	/**
	 * @return the position of log in boolean
	 */
	}
	public boolean getLeft() {
		return speed < 0;
	}
}
