import static org.junit.Assert.*;

import org.junit.Test;

public class IntroToTests {

	@Test
	public void test() {
		assertEquals(7, add(3,4));
		assertEquals(25, squareNum(5));
		assertEquals("Hi Bob", giveGreeting("Bob"));
		assertEquals("Hi Bob!!!", giveEnthusiasticGreeting("Bob"));
		
		assertTrue(isWeekend("Saturday"));
		assertFalse(isWeekend("Tuesday"));
		
		assertEquals("A", getGrade(95));
		assertEquals("B", getGrade(88));
		assertEquals("C", getGrade(72));
		assertEquals("D", getGrade(61));
		assertEquals("F", getGrade(41));
		
		assertEquals("stuffstuffstuff", repeatString("stuff", 3));
		assertEquals("stuff*-*stuff*-*stuff", repeatStringWithSeperator("stuff", "*-*", 3));
	}
	
	int add(int x, int y){
		
		return x + y;
		
	}
	
	int squareNum(int x){
		
		return x * x;
		
	}
	
	String giveGreeting(String x){
		
		return "Hi " + x;
		
	}
	
	String giveEnthusiasticGreeting(String x){
	
		return "Hi " + x + "!!!";
		
	}
	
	boolean isWeekend(String x){
		if(x.equals("Saturday") || x.equals("Sunday")){
			return true;
		}
		else{
			return false;
		}
	}
	
	String getGrade(int x){
		
		if(x > 90){
			return "A";
		}
		else if(x > 80){
			return "B";
		}
		else if(x > 70){
			return "C";
		}
		else if(x > 60){
			return "D";
		}
		else if(x < 60){
			return "F";
		}
		else{
			return "0";
		}
		
	}
	
	String repeatString(String x, int y){
		String total = x;
		for(int i = 1; i < y; i++){
			total += x;
		}
		return total;
	}
	
	String repeatStringWithSeperator(String x, String y, int z){
		String total = x;
		for(int i = 1; i < z; i++){
			total += y + x;
		}
		return total;
	}
}
