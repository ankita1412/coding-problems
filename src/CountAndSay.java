
public class CountAndSay {
    public static String countAndSay(int n) {
        if (n==1) {
            return "1";
        } else {
            String res = "";
            String s = countAndSay(n-1);
            int count = 1;
            char c;
            for (int i=0; i<s.length(); i++) {
	        	c = s.charAt(i);
               if (i+1<s.length() && c == s.charAt(i+1)) {
                count++;   
               } else {
                   res += Integer.toString(count) + c;
                   count = 1;
               }
            }
            return res;
        }
    }
    
	public static void main(String[] args) {
		String res = countAndSay(5);
		System.out.println(res);
	}
}
