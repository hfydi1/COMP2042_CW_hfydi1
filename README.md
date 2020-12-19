# COMP2042 Coursework - Frogger Game

Frogger is a classic retro game, where you play as a frog trying to cross a busy road and get across a river.

You have to avoid the oncoming traffic and try not to fall into the water.

The goal is to get 5 frogs into the end cave.

## Meaning Additions and Changes Made.
1. Added a SceneManager class that handles switching of game scene.
2. Added a main menu.
3. Added a game info scene.
4. Added an end game scene. This fixes the issue where the frog can still move around after the game ends.
5. Added a permanent highscore list that displays the 5 top scores as an alert at the end of the game.
6. Extensive Javadoc additions.
7. Program source code now follows MVC (Model View Controller) design pattern.
8. Repackaged java files into smaller and easier to maintain packages.
9. Moved all images and assets to a separate folder. This makes it more organized.
10. Well documented source code version control using GitHub.
11. Added difficulty modifier. This allows player to change difficulty.
12. Refactored every class to remove redundant comments and try to follow industry best practices.

## Key Refactoring Work and Bug Fixes (Maintenance)
1. Encapsulation. Add getters and setters. It is best practice to have getters and setters.

For example, in Animal.java:
```
Image imgW1;
```

Refactored to suit best practice. This was done for all the other classes.
```
private Image imgW1;

	public Image getImgW1() {
		return imgW1;
	}

	public void setImgW1(Image imgW1) {
		this.imgW1 = imgW1;
	}
```

2. Fix the game background and image filepath. 
![Fixed background:](/readme/froggame.png?raw=true "fixedbg")

3. Fixed score placement of the program.

4. Fixed a bug where the frog could walk outside of the game play area.

5. Fixed a bug where the frog could still move after game ends.

## Additions and Extensions
1. Main menu

![Screenshot:](/readme/frogmenu.png?raw=true "main menu")

2. Game info scene.

![Screenshot:](/readme/infoscene.png?raw=true "info")

3. Game difficulty scene. Allows player to change difficulty.

![Screenshot:](/readme/difficultyscene.png?raw=true "difficulty")

4. Added scene manager to allow for seamless and much more manageable scene changing and referencing.

5. Added MVC design pattern.
```
	public void openGameScene() throws Exception {
		GameView view = new GameView();
		GameModel model = new GameModel(primaryStage);
		GameController controller = new GameController(view, model);
		controller.StartGame();
	}
```
6. Added highscore pop up at the end of the game that displays top 5 scores.

7. Arranged the java files into packages that make it much more maintainable.

8. Added end screen to fix frog jumping around after game ends.

## Javadoc

Added javadoc comments to every method and every class. Javadoc files were also generated.

## GitHub

GitHub is the remote repository used for this project and has been branched to a development branch named "organize" to fit best practice.

Every commit in "organize" branch include comments to document work done.

A commit to "master" branch was done after the program maintenance was completed.

Link to the GitHub repository: [Link to GitHub Repository](https://github.com/hfydi1/COMP2042_CW_hfydi1)

### GitHub use

![Repository "organize" branch](/readme/github1.png?raw=true "repo")

![Commit history #1](/readme/github2.png?raw=tru "commit")

![Commit history #2](/readme/github3.png?raw=tru "commit")

![Commit history #3](/readme/github4.png?raw=tru "commit")



