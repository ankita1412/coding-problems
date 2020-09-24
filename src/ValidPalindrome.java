public class ValidPalindrome {
    
	public static boolean validPalindrome(String s) {
	int i = 0,j = s.length() -1;
       while (i<j) {
    	 Character c = s.charAt(i);
    	 if (Character.isDigit(c) || Character.isAlphabetic(c)) { //char found
    		 Character e = s.charAt(j);
    		 if (Character.isDigit(e) || Character.isAlphabetic(e)) { //char found
    			 if (Character.toLowerCase(c) == Character.toLowerCase(e)) {
    				 i++; j--;
    			 } else {
    				 return false;
    			 }
    		 } else {
    			 j--;
    		 }
    	 } else {
    		 i++;
    	 }
       }
        return true;
    }
    
	public static void main(String[] args) {
		String s = "a man namad";
		System.out.println(validPalindrome(s));	
	}
}
