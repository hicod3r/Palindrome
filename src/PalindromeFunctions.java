
public class PalindromeFunctions {

	public String printPalindromeBase(int i) {
		
		for( int j = 2 ; ;j++) {
			
			if(isPalindrome(Integer.toString(i, j))){
				return i + ", " + j;
				
			}
			
		}
			
	}
	
	public boolean isPalindrome(String toCompare) {
		
		int length = toCompare.length();
		
		for (int i = 0; i < (length/2); ++i) {
			if (toCompare.charAt(i) != toCompare.charAt(length - i - 1)) {
				return false;
			}
		}
		
		return true;
		
	}}
