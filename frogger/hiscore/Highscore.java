package frogger.hiscore;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Highscore {
	
	File highscores = new File ("src/assets/highscore/hs.txt");
	
	public ArrayList<Integer> scores = new ArrayList<Integer>();
	
	public void setScore(int points) throws IOException{
		
		if (highscores.exists() == false) {
			highscores.createNewFile();
		}
		
		for (int i=0; i<5; i++) {
			scores.add(0);
		}
		
		if (points>800) {
			points = 800;
		}
		
		if (points<0) {
			points = 0;
		}
		
		Scanner scanner = new Scanner(highscores);
		
		try {
			while(scanner.hasNextLine()) {
				String scorestring = scanner.nextLine();
				scores.add(Integer.parseInt(scorestring));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		scanner.close();
		
		if (scores.size()>5) {
			if(points>=scores.get(4)) {
				scores.add(points);
			}
		} else {
			scores.add(points);
		}
		
		Collections.sort(scores,Collections.reverseOrder());
		FileWriter filehs = new FileWriter(highscores);
		BufferedWriter bufferhs = new BufferedWriter(filehs);
		PrintWriter prinths = new PrintWriter(bufferhs);
		
		for (int i=0; i<5; i++) {
			prinths.println(scores.get(i));
		}
		
		prinths.close();
		
	}
	
	public void getScore() {
		try {
			Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("You Have Won The Game!");
    		alert.setHeaderText(showScores(scores));
    		alert.setContentText("Highest Possible Score: 800");
    		alert.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String showScores(ArrayList<Integer> array) {
		String sort = new String("Highscore\n1. " + array.get(0) + "\n2. " + array.get(1) + "\n3. " + array.get(2) + "\n4. " + array.get(3) + "\n5. " + array.get(4));
		return sort;
	}
	
}
