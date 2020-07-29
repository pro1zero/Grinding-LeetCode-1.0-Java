import java.util.*;
public class distanceBetweenTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {2,1,100,3};
		int[] nums2 = {-5,-2,10,-3,7};
		
		System.out.println(findDistance(nums1, nums2, 6));
	}
	
	public static int findDistance(int[] nums1, int[] nums2, int d) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int distance = nums1.length;
		
		for(int i = 0; i < nums1.length; i++) {
			int num = nums1[i];
			for(int j = 0; j < nums2.length; j++) {
				if(Math.abs(num - nums2[j]) <= d) {
					distance--;
					break;
				}
			}
		}
		return distance;
	}

}
