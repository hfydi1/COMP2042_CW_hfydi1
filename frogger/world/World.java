package frogger.world;


import java.util.ArrayList;
import java.util.List;
import frogger.actor.*;
import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

/**
 * Base class for the layout of the game.
 * 
 * @author daudho
 *
 */
public abstract class World extends Pane {
    private AnimationTimer timer;
    
    /**
     * Handler that listens to the changes and handles the game while the program is running.
     */
    public World() {
    	
    	sceneProperty().addListener(new ChangeListener<Scene>() {

			@Override
			public void changed(ObservableValue<? extends Scene> observable, Scene oldValue, Scene newValue) {
				if (newValue != null) {
					newValue.setOnKeyReleased(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyReleased() != null) 
								getOnKeyReleased().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyReleased() != null) {
									anActor.getOnKeyReleased().handle(event);
								}
							}
						}
						
					});
					
					newValue.setOnKeyPressed(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyPressed() != null) 
								getOnKeyPressed().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyPressed() != null) {
									anActor.getOnKeyPressed().handle(event);
								}
							}
						}
						
					});
				}
				
			}
    		
		});
    }
    
    /**
     * Create timer for the game on program start.
     */
    public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                act(now);
                List<Actor> actors = getObjects(Actor.class);
                
                for (Actor anActor: actors) {
                	anActor.act(now);
                }
      
            }
        };
    }
    
    /**
     * Start game timer.
     */
    public void start() {
    	createTimer();
        timer.start();
    }
    
    /**
     * Stop game timer.
     */
    public void stop() {
        timer.stop();
    }
    
    /**
     * For addition of an actor
     * @param actor
     */
    public void add(Actor actor) {
        getChildren().add(actor);
    }
    
    /**
     * For removal of an actor
     * @param actor
     */
    public void remove(Actor actor) {
        getChildren().remove(actor);
    }
    
    /**
     * Get a list of all child nodes attached to the root node.
     * @param <A>
     * @param cls
     * @return an ArrayList of all child nodes.
     */
    public <A extends Actor> List<A> getObjects(Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (Node n: getChildren()) {
            if (cls.isInstance(n)) {
                someArray.add((A)n);
            }
        }
        return someArray;
    }
    
    /**
     * 
     * @param now The timestamp of the current frame given  in nanoseconds.
     * This will be the same value for all AnimationTimers called during one frame.
     */
    public abstract void act(long now);
}
