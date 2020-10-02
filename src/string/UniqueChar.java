import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueChar {
	
    public static int singleNumber(int[] nums) {
    	int result = 0;
    	for (int i=0; i<nums.length; i++) {
    		result ^= nums[i];
    	}
    	System.out.println(result);
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,1,2,2,4,5,2,4,5};
		int[] result = new int[] {};
		String s = "leetcode";
		singleNumber(nums);
	}

}
