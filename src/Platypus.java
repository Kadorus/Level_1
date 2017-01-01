public class Platypus {
	private String name;
	public double platypusNetWorth;
	public boolean isAPenguin;

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public String namePlatypus(String nhame){
		
		this.name = nhame;
		
		return nhame;
		
	}
	
	 void OnAScaleOfOneToTenHowMuchDoYouLikeDogs(int DOGGIES){
		
		if(DOGGIES < 10){
			
			System.out.println("That is not the correct answer.");
			
			this.platypusNetWorth = -7.2;
			
		}
		
		if(DOGGIES >= 10){
			
			System.out.println("You have answered correctly.");
			
			this.platypusNetWorth = 420;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus Jarvan = new Platypus();
		
		Jarvan.namePlatypus("Jarvan IV");
		Jarvan.OnAScaleOfOneToTenHowMuchDoYouLikeDogs(534);
		
		//2. Call the sayHi method
		Jarvan.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}
