public class Athlete{
	private static int count = 0;
	private int runnerSpeed = 0;
	private static String location = "Sesame Street";
	private String runnerName = "";
	private int bibNumber;
	
	public Athlete(String name, int speed){
		
		runnerName = name;
		
		runnerSpeed = speed;
		
		count++;
		
		bibNumber = count;
		
	}

	public static String getLocation() {
		return location;
	}

	public static void setLocation(String newlocation) {
		location = newlocation;
	}

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getRunnerSpeed() {
		return runnerSpeed;
	}

	public void setRunnerSpeed(int runnerSpeed) {
		this.runnerSpeed = runnerSpeed;
	}

	public String getRunnerName() {
		return runnerName;
	}

	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}

	public int getBibNumber() {
		return bibNumber;
	}

	public void setBibNumber(int bibNumber) {
		this.bibNumber = bibNumber;
	}
	
	
}