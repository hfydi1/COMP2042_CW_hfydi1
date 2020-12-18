package frogger.actor;

import javafx.scene.image.Image;

/**
 * Responsible for the movement of the trucks and cars.
 * 
 * @author daudho
 *
 */
public class Obstacle extends Actor {
	private double speed;
	
	/**
	 * Get the actual state of the obstacle.
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -50 && speed<0)
			setX(600);
	}
	
	/**
	 * Construct for obstacle by getting parameters imageLink, x-axis, y-axis, position, speed, width and height.
	 * @param imageLink link of the image.
	 * @param xpos x-axis of the obstacle on the game scene.
	 * @param ypos y-axis of the obstacle on the game scene.
	 * @param s speed of the obstacle.
	 * @param w width of the obstacle image.
	 * @param h height of the obstacle image.
	 */
	public Obstacle(String imageLink, int xpos, int ypos, double s, int w, int h) {
		setImage(new Image(imageLink, w, h, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
	}

}
