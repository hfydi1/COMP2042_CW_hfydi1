package frogger.world;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import frogger.actor.*;
import frogger.game.*;
import frogger.mainmenu.*;

/**
 * Acts as the background for the game.
 * Supports playing music during gameplay.
 * 
 * @author daudho
 *
 */
public class MyStage extends World{
	MediaPlayer mediaPlayer;
	@Override
	public void act(long now) {
		
	}
	
	public MyStage() {
		
	}
	
	/**
	 * Used to play music when the game is active.
	 */
	public void playMusic() {
		String musicFile = "src/assets/sounds/Frogger Main Song Theme (loop).mp3";   
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}
	
	/**
	 * Used to stop the music.
	 */
	public void stopMusic() {
		mediaPlayer.stop();
	}

}
