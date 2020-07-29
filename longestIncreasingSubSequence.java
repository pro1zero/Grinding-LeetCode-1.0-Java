import java.util.*;

public class longestIncreasingSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 70, 20, 30, 50, 11, 30};
		System.out.println(longest(nums));
	}
	
	public static int longest(int[] nums) {
		if(nums.length == 0)
			return 0;
		
		if(nums.length == 1)
			return 1;
		
		int longestSequence = 0;
		int index = 0;
		
		int[] dp = new int[nums.length];
		Arrays.fill(dp,1);
		for(int i = 1; i<nums.length;i++) {
			for(int j = 0; j<i;j++) {
				if(nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			longestSequence = Math.max(longestSequence, dp[i]);
			index = i;
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(dp));
		System.out.println(buildSequence(index, longestSequence, nums, dp));
		return longestSequence;
	}
	
	public static List<Integer> buildSequence(int index, int longestSequence, int[] nums, int[] dp){
		List<Integer> result = new ArrayList<>();
		
		while(longestSequence > 0 && index >= 0) {
			if(dp[index] == longestSequence) {
				result.add(nums[index]);
				longestSequence--;
			}
			index--;
		}
		Collections.reverse(result);
		return result;
	}

}
