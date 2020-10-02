import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntegerPlusOne {
	public static int[] plusOne(int[] digits) {
		ArrayList<Integer> res = new ArrayList<>();
		int[] resArray;
		boolean carry = true;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (carry && digits[i] == 9) {
				res.add(0, 0);
				carry = true;
			} else if (carry) {
				res.add(0, digits[i] + 1);
				carry = false;
			} else {
				res.add(0, digits[i]);
			}
		}
		if (carry) {
			res.add(0, 1);
		}
		resArray = new int[res.size()];
		for (int i = 0; i < resArray.length; i++) {
			resArray[i] = res.get(i);
		}
		return resArray;

	}

	public static void main(String[] args) {
		int[] nums1 = new int[] { 4, 9, 5 };
		int[] nums2 = new int[] { 6, 2, 1, 4, 9 };
		int[] nums3 = new int[] { 9 };
		System.out.println(Arrays.toString(plusOne(nums3)));
	}

}
