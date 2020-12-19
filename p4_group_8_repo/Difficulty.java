package p4_group_8_repo;

import frogger.difficulty.*;

/**
 * Used to easily modify the difficulty of the game by changing the speed of obstacles.
 * This is an implementation of levels.
 * 
 * @author daudho
 *
 */
public class Difficulty {
	private double logSpeed1, logSpeed2, obstacleSpeed1, obstacleSpeed2;
	private int turtleSpeed, wetTurtleSpeed, choice;
	private GameDifficultyModel diff;
	double s1, s2, s4, s5;
	int s3, s6;
		
	public Difficulty() {
		
		diff = new GameDifficultyModel();
		
		choice = diff.getChoice();
		
		switch (choice) {
		case 1:
			s1 = 0.2;
			s2 = -1;
			s3 = -1;
			s4 = 0.5;
			s5 = 1;
			s6 = -1;
			break;
		case 2:
			s1 = 0.5;
			s2 = -1.2;
			s3 = -1;
			s4 = 0.8;
			s5 = 1.6;
			s6 = -1;
			break;
		case 3:
			s1 = 2;
			s2 = -3;
			s3 = -4;
			s4 = 2;
			s5 = 2.5;
			s6 = -1;
			break;
		default:
			s1 = 0.2;
			s2 = -1;
			s3 = -1;
			s4 = 0.5;
			s5 = 1;
			s6 = -1;
			break;
		}
		
		this.logSpeed1 = s1;
		this.logSpeed2 = s2;
		this.turtleSpeed = s3;
		this.obstacleSpeed1 = s4;
		this.obstacleSpeed2 = s5;
		this.wetTurtleSpeed = s6;
	}
		
	public double getLogSpeed1(){
		return this.logSpeed1;
	}
	
	public double getLogSpeed2() {
		return this.logSpeed2;
	}
	
	public int getTurtleSpeed(){
		return this.turtleSpeed;
	}
	
	public double getObstacleSpeed1() {
		return this.obstacleSpeed1;
	}
	
	public double getObstacleSpeed2() {
		return this.obstacleSpeed2;
	}
	
	public int getWetTurtleSpeed() {
		return this.wetTurtleSpeed;
	}
	
	public int getChoose() {
		return this.choice;
	}
}


