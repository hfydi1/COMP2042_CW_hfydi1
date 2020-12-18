package frogger.actor;

import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;

import java.util.ArrayList;

import frogger.world.World;

/**
 * The abstract class for all the objects
 * inside this package.
 * 
 * @author daudho
 *
 */
public abstract class Actor extends ImageView{
	
	/**
	 * Gets the movement of the actor.
	 * @param dx for the difference in change for x-axis (in pixels).
	 * @param dy for the difference in change for y-axis (in pixels).
	 */
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    
    /**
     * Allows access to the world.
     * This is done by getting the parent node of the instance. 
     * 
     * @return world object
     */
    public World getWorld() {
        return (World) getParent();
    }
    
    /**
     * Allows access to the width of ImageView.
     * 
     * @return width of any child node calling the method "getWidth".
     */
    public double getWidth() {
        return this.getBoundsInLocal().getWidth();
    }

    /**
     * Allows access to the height of ImageView
     * 
     * @return height of any child node calling the method "getHeight".
     */
    public double getHeight() {
        return this.getBoundsInLocal().getHeight();
    }

    /**
     * Checks for any intersection.
     * @param <A> class that extends Actor
     * @param cls filters all intersecting nodes.
     * @return an Array of all the instances that intersect with this instance.
     */
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
    
    public void manageInput(InputEvent e) {
        
    }

    public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
                break;
            }
        }
        return someArray.get(0);
    }
    
    /**
     * 
     * @param now The timestamp of the current frame given  in nanoseconds.
     * This will be the same value for all AnimationTimers called during one frame.
     */
    public abstract void act(long now);

}
