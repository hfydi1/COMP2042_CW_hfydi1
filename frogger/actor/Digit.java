package frogger.actor;

import javafx.scene.image.Image;

/**
 * To display the score of the player
 * 
 * @author daudho
 *
 */
public class Digit extends Actor{
	int dim;
	Image im1;
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * Displays player score with images known as digit.
	 * @param n is the number that corresponds to the score and image.
	 * @param dim size.
	 * @param x x-axis position to display the image.
	 * @param y y-axis position to display the image.
	 */
	public Digit(int n, int dim, int x, int y) {
		im1 = new Image("file:src/assets/img/digits/"+n+".png", dim, dim, true, true);
		setImage(im1);
		setX(x);
		setY(y);
	}
	
}
