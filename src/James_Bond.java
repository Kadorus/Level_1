
public class James_Bond {
	
	Vault vault = new Vault();
	
	public int findCode(){
		
		for(int i = 0; i < 1000000; i++){
			
			if(i == vault.secretCode){
				System.out.println(i);
				return i;
			}
			
		}
		System.out.println(-1);
		return -1;
		
	}
}
