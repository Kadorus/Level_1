import static org.junit.Assert.*;

import org.junit.Test;

public class StringTests {
	@Test
	public void test1() {
		assertEquals("wpaafnfclaekses", weaveStrings("waffles", "pancakes"));
	}
	
	@Test
	public void test2() {
		assertEquals("Mntvrse", removeVowels("MountEverest"));
	}
	
	@Test
	public void test3() {
		assertEquals("toboRtoboR", reverseRepeat("Robot"));
	}
	
	public String weaveStrings(String one, String two){
		char[] value = new char[one.length() + two.length()];
		for(int i = 0; i < one.length(); i+=2){
			value[i] = one.charAt(i/2);
		}
		for(int i = 1; i < two.length(); i+=2){
			value[i] = two.charAt(i/2);
		}
		return value.toString();
	}
	
	public String removeVowels(String one){
		char[] value = new char[one.length()];
		for(int i = 0; i < one.length(); i++){
			if(one.charAt(i) != 'a' && one.charAt(i) != 'e' && one.charAt(i) != 'i' && one.charAt(i) != 'o' && one.charAt(i) != 'u'){
				value[i] = one.charAt(i);
			}
		}
		String valueString = "";
		for(int i = 0; i < one.length(); i++){
			valueString = "" + value[i];
		}
		System.out.println(valueString);
		return valueString;
	}
	
	public String reverseRepeat(String one){
		char[] value = new char[one.length()];
		for(int i = 0; i < one.length(); i++){
			value[i] = one.charAt(one.length() - (i+1));
		}
		return value.toString() + value.toString();
	}

}
