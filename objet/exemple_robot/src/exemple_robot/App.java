package exemple_robot;

import exemple_robot.Robot.Action;

public class App {

	public static void main(String[] args) {
		
		Robot bot = new Robot("r2d2");
		bot.deplacement(Action.HAUT);
		bot.deplacement(Action.TETE);

	}

}
