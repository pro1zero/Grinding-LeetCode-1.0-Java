import java.util.*;
public class distributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3};
		System.out.println(distributeCandy(nums));
	}
	
	public static int distributeCandy(int[] nums) {
		if(nums.length == 0)
			return 0;
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		return Math.min(set.size(), nums.length/2);
	}

}
