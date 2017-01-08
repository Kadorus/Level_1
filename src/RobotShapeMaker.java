import org.jointheleague.graphical.robot.Robot;

public class RobotShapeMaker {
	
	private Robot bot1 = new Robot();
	
	RobotShapeMaker(Robot r){
		
		this.bot1 = r;
		
	
		
	
		
	}
	
	void drawCube(int size){
			
		bot1.penDown();
		
		bot1.setSpeed(10);
		
		bot1.move(size);
		
		bot1.turn(135);
		
		bot1.move(size);
		
		bot1.turn(180);
		
		bot1.move(size);
		
		bot1.turn(135);
		
		bot1.move(size);
		
		bot1.turn(45);
		
		bot1.move(size);
		
		bot1.turn(45);
		
		bot1.move(size);
		
		bot1.turn(135);
		
		bot1.move(size);
		
		bot1.turn(180);
		
		bot1.move(size);
		
		bot1.turn(135);
		
		bot1.move(size);
		
		bot1.turn(45);
		
		bot1.move(size);
		
		bot1.turn(135);
		
		bot1.move(size);
		
		bot1.turn(-90);
		
		bot1.move(size);
		
		bot1.turn(135);
		
		bot1.move(size);
		
		bot1.turn(135);
		
		bot1.move(size);
		
		bot1.turn(-90);
		
		bot1.move(size);
	
	}
	
	void drawShape(int size, int sides){
		
		for(int i = 0; i < sides; i++){
			
			bot1.penDown();
			
			bot1.setSpeed(10);
			
			bot1.move(size);
			
			bot1.turn(360/sides);
			
			bot1.penUp();
			
		}
		
	}
	
}
