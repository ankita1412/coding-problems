import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayIntersection {
	public static int[] intersect(int[] nums1, int[] nums2) {
		int[] intersectionArray;
		ArrayList<Integer> res = new ArrayList<>();
		int[] smallArray, largeArray;
		HashMap<Integer, Integer> map = new HashMap<>();

		if (nums1.length <= nums2.length) {
			smallArray = nums1;
			largeArray = nums2;
		} else {
			smallArray = nums2;
			largeArray = nums1;
		}

		for (int i = 0; i < smallArray.length; i++) {
			int key = smallArray[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		for (int i = 0; i < largeArray.length; i++) {
			int key = largeArray[i];
			if (map.containsKey(key)) {
				if (map.get(key) > 1)
					map.put(key, map.get(key) - 1);
				else
					map.remove(key);
				res.add(key);
			}
		}
		intersectionArray = new int[res.size()];
		for (int i = 0; i < intersectionArray.length; i++) {
			intersectionArray[i] = res.get(i);
		}
		return intersectionArray;
	}

	public static void main(String[] args) {
		int[] nums1 = new int[] { 4, 9, 5 };
		int[] nums2 = new int[] { 6, 2, 1, 4, 9 };
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}

}
