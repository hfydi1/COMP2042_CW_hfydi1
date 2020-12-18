package frogger.actor;

import javafx.scene.image.Image;

/**
 * Responsible for the movement of turtles.
 * Acts as a stepping stone for the frog to cross the water safely.
 * 
 * @author daudho
 *
 */
public class Turtle extends Actor{
	private Image turtle1;
	private Image turtle2;
	private Image turtle3;
	private double speed;
	boolean bool = true;
	
	/**
	 * Get the actual position of the turtle.
	 */
	@Override
	public void act(long now) {
		
		if (now/900000000  % 3 ==0) {
			setImage(turtle2);		
			}
		else if (now/900000000 % 3 == 1) {
			setImage(turtle1);	
			}
		else if (now/900000000 %3 == 2) {
			setImage(turtle3);		
			}
			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	
	//Getter and setters
	public Image getTurtle1() {
		return turtle1;
	}
	
	public void setTurtle1(Image turtle1) {
		this.turtle1 = turtle1;
	}
	
	public Image getTurtle2() {
		return turtle2;
	}
	
	public void setTurtle2(Image turtle2) {
		this.turtle2 = turtle2;
	}
	
	public Image getTurtle3() {
		return turtle3;
	}
	
	public void setTurtle3(Image turtle3) {
		this.turtle3 = turtle3;
	}
	
	
	/**
	 * Construct for turtle that takes in x-axis, y-axis, speed, width and height.
	 * @param xpos x-axis of turtle on game scene.
	 * @param ypos y-axis of turtle on game scene.
	 * @param s speed of turtle.
	 * @param w width of turtle image.
	 * @param h height of turtle image.
	 */
	public Turtle(int xpos, int ypos, int s, int w, int h) {
		turtle1 = new Image("file:src/assets/img/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:src/assets/img/TurtleAnimation2.png", w, h, true, true);
		turtle3 = new Image("file:src/assets/img/TurtleAnimation3.png", w, h, true, true);
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}
}
