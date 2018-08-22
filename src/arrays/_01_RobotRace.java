package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int smallestY= 100000;
	static int winner = 0;
	// 1. make a main method
	public static void main(String[] args) {
		Random r = new Random();

		// 2. create an array of 5 robots.
		Robot[] racers = new Robot[46];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < racers.length; i++) {
			racers[i] = new Robot("mini", (i * 20), 750);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (smallestY > 0) {
		for (int i = 0; i < racers.length; i++) {
			
				racers[i].setSpeed(30);

				racers[i].move(r.nextInt(50));
				if(racers[i].getY()<smallestY) {
					smallestY = racers[i].getY();
					winner = (racers[i].getX()/20)+1;
					
				}
				
			}

		}
		System.out.println(winner);
		
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}