package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot r2d2= new Robot();

r2d2.setSpeed(10);
		// 4. Do the following (steps 5-8) 75 times
for (int i = 0; i < 75; i++) {
	r2d2.penDown();
	r2d2.move(5*i);
	r2d2.setRandomPenColor();
	r2d2.turn(360/7);
	r2d2.setPenWidth(i);
}
	
	
	
	
			// 9. Set the pen width to i

	}
}
