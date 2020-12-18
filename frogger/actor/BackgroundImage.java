package frogger.actor;

import javafx.scene.image.Image;

/**
 * To set background image of the game scene.
 * 
 * @author daudho
 *
 */
public class BackgroundImage extends Actor{

	@Override
	public void act(long now) {
		
		
	}
	
	/**
	 * BackGroundImage is created by getting parameter imageLink.
	 * @param link of the image
	 */
	public BackgroundImage(String imageLink) {
		setImage(new Image(imageLink, 600, 800, true, true));
		
	}

}
