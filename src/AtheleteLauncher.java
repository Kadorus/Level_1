
public class AtheleteLauncher {
	public static void main(String[] args){
		
	Athlete Jorge = new Athlete("Jorge", 52);
	
	Athlete Jackson = new Athlete("Jackson", 97);
	
	Athlete.setLocation("Disneyland");
	
	System.out.println(Jorge.getRunnerName() + " " + Jorge.getBibNumber());
	
	System.out.println(Jackson.getRunnerName() + " " + Jackson.getBibNumber());
	
	System.out.println(Athlete.getCount());
	
	System.out.println(Athlete.getLocation());
	
	}	
}
