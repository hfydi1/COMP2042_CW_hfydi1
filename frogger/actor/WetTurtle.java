package frogger.actor;

import javafx.scene.image.Image;

/**
 * Responsible for the movement of turtle that are under the water.
 * Acts as stepping stone to cross water before fully submerged under water.
 * 
 * @author daudho
 *
 */
public class WetTurtle extends Actor{
	Image turtle1;
	Image turtle2;
	Image turtle3;
	Image turtle4;
	private int speed;
	int i = 1;
	boolean bool = true;
	boolean sunk = false;
	
	/**
	 * Get now as parameter instead of act method to set the actual sunken turtle position.
	 */
	@Override
	public void act(long now) {

				if (now/900000000  % 4 ==0) {
					setImage(turtle2);
					sunk = false;
					
				}
				else if (now/900000000 % 4 == 1) {
					setImage(turtle1);
					sunk = false;
				}
				else if (now/900000000 %4 == 2) {
					setImage(turtle3);
					sunk = false;
				} else if (now/900000000 %4 == 3) {
					setImage(turtle4);
					sunk = true;
				}
			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	/**
	 * Construct for turtle that takes in x-axis, y-axis, speed, width and height.
	 * @param xpos x-axis of turtle on game scene.
	 * @param ypos y-axis of turtle on game scene.
	 * @param s speed of turtle.
	 * @param w width of turtle image.
	 * @param h height of turtle image.
	 */
	public WetTurtle(int xpos, int ypos, int s, int w, int h) {
		turtle1 = new Image("file:src/assets/img/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:src/assets/img/TurtleAnimation2Wet.png", w, h, true, true);
		turtle3 = new Image("file:src/assets/img/TurtleAnimation3Wet.png", w, h, true, true);
		turtle4 = new Image("file:src/assets/img/TurtleAnimation4Wet.png", w, h, true, true);
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}
	
	/**
	 * 
	 * @return if the turtle is under water or not.
	 */
	public boolean isSunk() {
		return sunk;
	}
}
