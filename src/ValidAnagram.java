import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> counter = new HashMap<Character, Integer>();
        for (int i=0; i<s.length(); i++) {
        	Integer count = counter.get(s.charAt(i));
        	if (count == null) {
        		counter.put(s.charAt(i), 1);
        	} else {
        		counter.put(s.charAt(i), count + 1);
        	}
        }
        System.out.println(counter.toString());
        for (int i=0; i<t.length(); i++) {
        	Integer count = counter.get(t.charAt(i));
        	if (count == null) {
        		return false;
        	} else if (count == 1){
        		counter.remove(t.charAt(i));
        	} else {
        		counter.put(t.charAt(i), count - 1);
        	}
        }
        System.out.println(counter);
        if (counter.isEmpty()) {
        	return true;
        }
        return false;
    }
    
	public static void main(String[] args) {
		String s = "a";
		String t = "b";
		System.out.println(validAnagram(s, t));	
	}
}
