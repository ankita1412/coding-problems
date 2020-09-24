import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i1=m-1, i2=n-1, res=m+n-1;
        
        for (int i=0; i<m+n; i++) {
            if (nums1[i1] > nums2[i2]) {
                nums1[res-i] = nums1[i1--];
            } else {
                nums1[res-i] = nums2[i2--];
            }
        }
    }    
	public static void main(String[] args) {
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {4,5,6};
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
		Set<Integer> set = new HashSet<Integer>();
		set.
	}
}
