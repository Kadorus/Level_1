
public class Minion {
	private String name;
	private int eyes; 
	private String color; 
	private String master;
	
	public Minion(String n, int e, String c, String m){
		name = n;
		eyes = e;
		color = c;
		master = m;
	}
	
	public String getName(){
		return name;
	}
	
	public int getEyes(){
		return eyes;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getMaster(){
		return master;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setEyes(int e){
		eyes = e;
	}
	
	public void setColor(String c){
		color = c;
	}
	
	public void setMaster(String m){
		master = m;
	}
}
