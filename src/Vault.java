public class Vault{
	
	int secretCode = 7;
	
	public static void main(String args[]){
		
		James_Bond JamesBond = new James_Bond();
		
		JamesBond.findCode();
		
	}
	
	public boolean tryCode(int guess){
		if(secretCode == guess){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setCode(int code){
		secretCode = code;
	}
}