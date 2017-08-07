import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeChallengeTest{

	String[] testString = {
		"0, 2","1, 2","2, 3","3, 2","4, 3","5, 2",
		"6, 5","7, 2","8, 3","9, 2","10, 3","11, 10",
		"12, 5","13, 3","14, 6","15, 2","16, 3",
		"17, 2","18, 5","19, 18"
	};
	
	
	@Test
	public void testBase() {
		
		PalindromeFunctions function = new PalindromeFunctions();
		
		for( int i = 0 ; i <= 19; i++)	
			assertEquals(testString[i],function.printPalindromeBase(i));
		
	}

}
