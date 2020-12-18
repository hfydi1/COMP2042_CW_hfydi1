package frogger.actor;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * {@code Animal} holds a playable character that handles {@code KeyEvents}, in this case "W A S D" keys
 * from the player. Animal instance interacts with other nodes that interacts with it.
 * 
 * This class is about the sprite(frog) that the user is playing as.
 * @author daudho
 * 
 */
public class Animal extends Actor {
	
	private Image imgW1;
	private Image imgA1;
	private Image imgS1;
	private Image imgD1;
	private Image imgW2;
	private Image imgA2;
	private Image imgS2;
	private Image imgD2;
	
	int points = 0;
	int end = 0;
	
	private boolean second = false;
	boolean noMove = false;
	double movement = 13.3333333*2;
	double movementX = 10.666666*2;
	int imgSize = 40;
	boolean carDeath = false;
	boolean waterDeath = false;
	boolean stop = false;
	boolean changeScore = false;
	int carD = 0;
	double w = 800;
	ArrayList<End> inter = new ArrayList<End>();
	
	/**
	 * Animal is created by getting the parameter imageLink.
	 * @param imageLink is used to get images to display the sprite(frog) in the game scene.
	 */
	public Animal(String imageLink) {
		setImage(new Image(imageLink, imgSize, imgSize, true, true));
		setX(300);
		setY(679.8+movement);
		imgW1 = new Image("file:src/assets/img/froggerUp.png", imgSize, imgSize, true, true);
		imgA1 = new Image("file:src/assets/img/froggerLeft.png", imgSize, imgSize, true, true);
		imgS1 = new Image("file:src/assets/img/froggerDown.png", imgSize, imgSize, true, true);
		imgD1 = new Image("file:src/assets/img/froggerRight.png", imgSize, imgSize, true, true);
		imgW2 = new Image("file:src/assets/img/froggerUpJump.png", imgSize, imgSize, true, true);
		imgA2 = new Image("file:src/assets/img/froggerLeftJump.png", imgSize, imgSize, true, true);
		imgS2 = new Image("file:src/assets/img/froggerDownJump.png", imgSize, imgSize, true, true);
		imgD2 = new Image("file:src/assets/img/froggerRightJump.png", imgSize, imgSize, true, true);
		
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			/**
			 * Handles movement and animation for the sprite(frog) as the player uses "W A S D" keys to move.
			 * 
			 */
			public void handle(KeyEvent event){
				if (noMove) {
					
				}
				else {
				if (second) {
					if (event.getCode() == KeyCode.W) {	  
		                move(0, -movement);
		                changeScore = false;
		                setImage(imgW1);
		                second = false;
		            }
		            else if (event.getCode() == KeyCode.A) {	            	
		            	 move(-movementX, 0);
		            	 setImage(imgA1);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.S) {	            	
		            	 move(0, movement);
		            	 setImage(imgS1);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.D) {	            	
		            	 move(movementX, 0);
		            	 setImage(imgD1);
		            	 second = false;
		            }
				}
				else if (event.getCode() == KeyCode.W) {	            	
	                move(0, -movement);
	                setImage(imgW2);
	                second = true;
	            }
	            else if (event.getCode() == KeyCode.A) {	            	
	            	 move(-movementX, 0);
	            	 setImage(imgA2);
	            	 second = true;
	            }
	            else if (event.getCode() == KeyCode.S) {	            	
	            	 move(0, movement);
	            	 setImage(imgS2);
	            	 second = true;
	            }
	            else if (event.getCode() == KeyCode.D) {	            	
	            	 move(movementX, 0);
	            	 setImage(imgD2);
	            	 second = true;
	            }
	        }
			}
		});	
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				if (noMove) {}
				else {
				if (event.getCode() == KeyCode.W) {	  
					if (getY() < w) {
						changeScore = true;
						w = getY();
						points+=10;
					}
	                move(0, -movement);
	                setImage(imgW1);
	                second = false;
	            }
	            else if (event.getCode() == KeyCode.A) {	            	
	            	 move(-movementX, 0);
	            	 setImage(imgA1);
	            	 second = false;
	            }
	            else if (event.getCode() == KeyCode.S) {	            	
	            	 move(0, movement);
	            	 setImage(imgS1);
	            	 second = false;
	            }
	            else if (event.getCode() == KeyCode.D) {	            	
	            	 move(movementX, 0);
	            	 setImage(imgD1);
	            	 second = false;
	            }
	        }
			}
			
		});
	}
	
	/**
	 * Used to reflect the death of frog on the game scene.
	 */
	@Override
	public void act(long now) {
		if (getY()<0 || getY()>734) {
			setX(300);
			setY(679.8+movement);
		}
		if (getX()<0) {
			move(movement*2, 0);
		}
		if (carDeath) {
			noMove = true;
			if ((now)% 11 ==0) {
				carD++;
			}
			if (carD==1) {
				setImage(new Image("file:src/assets/img/cardeath1.png", imgSize, imgSize, true, true));
			}
			if (carD==2) {
				setImage(new Image("file:src/assets/img/cardeath2.png", imgSize, imgSize, true, true));
			}
			if (carD==3) {
				setImage(new Image("file:src/assets/img/cardeath3.png", imgSize, imgSize, true, true));
			}
			if (carD == 4) {
				setX(300);
				setY(679.8+movement);
				carDeath = false;
				carD = 0;
				setImage(new Image("file:src/assets/img/froggerUp.png", imgSize, imgSize, true, true));
				noMove = false;
				if (points>50) {
					points-=50;
					changeScore = true;
				}
			}
			
		}
		if (waterDeath) {
			noMove = true;
			if ((now)% 11 ==0) {
				carD++;
			}
			if (carD==1) {
				setImage(new Image("file:src/assets/img/waterdeath1.png", imgSize,imgSize , true, true));
			}
			if (carD==2) {
				setImage(new Image("file:src/assets/img/waterdeath2.png", imgSize,imgSize , true, true));
			}
			if (carD==3) {
				setImage(new Image("file:src/assets/img/waterdeath3.png", imgSize,imgSize , true, true));
			}
			if (carD == 4) {
				setImage(new Image("file:src/assets/img/waterdeath4.png", imgSize,imgSize , true, true));
			}
			if (carD == 5) {
				setX(300);
				setY(679.8+movement);
				waterDeath = false;
				carD = 0;
				setImage(new Image("file:src/assets/img/froggerUp.png", imgSize, imgSize, true, true));
				noMove = false;
				if (points>50) {
					points-=50;
					changeScore = true;
				}
			}
			
		}
		
		if (getX()>600) {
			move(-movement*2, 0);
		}
		if (getIntersectingObjects(Obstacle.class).size() >= 1) {
			carDeath = true;
		}
		if (getX() == 240 && getY() == 82) {
			stop = true;
		}
		if (getIntersectingObjects(Log.class).size() >= 1 && !noMove) {
			if(getIntersectingObjects(Log.class).get(0).getLeft())
				move(-1,0);
			else
				move (0.2,0);
		}
		else if (getIntersectingObjects(Turtle.class).size() >= 1 && !noMove) {
			move(-1,0);
		}
		else if (getIntersectingObjects(WetTurtle.class).size() >= 1) {
			if (getIntersectingObjects(WetTurtle.class).get(0).isSunk()) {
				waterDeath = true;
			} else {
				move(-1,0);
			}
		}
		else if (getIntersectingObjects(End.class).size() >= 1) {
			inter = (ArrayList<End>) getIntersectingObjects(End.class);
			if (getIntersectingObjects(End.class).get(0).isActivated()) {
				end--;
				points-=50;
			}
			points+=50;
			changeScore = true;
			w=800;
			getIntersectingObjects(End.class).get(0).setEnd();
			end++;
			setX(300);
			setY(679.8+movement);
		}
		else if (getY()<413){
			waterDeath = false;
			//setX(300);
			//setY(679.8+movement);
		}
	}
	
	/**
	 *
	 * @return when 5 frogs enter the "End" box, game stops.
	 */
	public boolean getStop() {
		return end==5;
	}
	
	
	/**
	 *
	 * @return returns points from playing
	 */
	public int getPoints() {
		return points;
	}
	
	
	/**
	 * 
	 * @return true if score is changed, false if score is not changed.
	 */
	public boolean changeScore() {
		if (changeScore) {
			changeScore = false;
			return true;
		}
		return false;
		
	}

	//Getters and setters
	public Image getImgW1() {
		return imgW1;
	}

	public void setImgW1(Image imgW1) {
		this.imgW1 = imgW1;
	}

	public Image getImgA1() {
		return imgA1;
	}

	public void setImgA1(Image imgA1) {
		this.imgA1 = imgA1;
	}

	public Image getImgS1() {
		return imgS1;
	}

	public void setImgS1(Image imgS1) {
		this.imgS1 = imgS1;
	}

	public Image getImgD1() {
		return imgD1;
	}

	public void setImgD1(Image imgD1) {
		this.imgD1 = imgD1;
	}

	public Image getImgW2() {
		return imgW2;
	}

	public void setImgW2(Image imgW2) {
		this.imgW2 = imgW2;
	}

	public Image getImgA2() {
		return imgA2;
	}

	public void setImgA2(Image imgA2) {
		this.imgA2 = imgA2;
	}

	public Image getImgS2() {
		return imgS2;
	}

	public void setImgS2(Image imgS2) {
		this.imgS2 = imgS2;
	}

	public Image getImgD2() {
		return imgD2;
	}

	public void setImgD2(Image imgD2) {
		this.imgD2 = imgD2;
	}


}
