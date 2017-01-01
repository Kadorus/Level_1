public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
		Human dog = new Human("dog");
		//2. create a new Robot army of good and evil robots.

		Robot[] theArmy = new Robot[420];
		
		for(int i = 0; i < theArmy.length; i++){
			
			String names = "Robot Number " + Math.random() * 100000;
			
			boolean evilness;
			
			if(Math.random() * 100 > 50){
				
				evilness = true;
				
			}
			else{
				
				evilness = false;
				
			}
			
			theArmy[i] = new Robot(names, evilness);
			
		}
		
		
		//3. command your robot army to destroy a human
		
			theArmy[(int)Math.random()*420].destroy(dog);
			
			theArmy[(int)Math.random()*419].destroyBot(theArmy[(int)Math.random()*418]);
		
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public String roboName(){
		return name;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
	
	public void destroyBot(Robot botster){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh YES! the robot " + name + " obliterated " +botster.roboName());
		}
		else{
			System.out.println("The pitiful good robot " + name + " was too weak and was defeated in single combat by " + botster.roboName());
			
		}
	}
}

