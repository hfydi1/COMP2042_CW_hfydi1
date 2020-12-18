package p4_group_8_repo;

public class Difficulty {
	private double logSpeed1, logSpeed2, obstacleSpeed;
	private int turtleSpeed;
		
	public Difficulty() {
		this.logSpeed1 = 0.2;
		this.logSpeed2 = -1;
		this.turtleSpeed = -1;
		this.obstacleSpeed = 1;
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
	
	public double getObstacleSpeed() {
		return this.obstacleSpeed;
	}
		
	
}


