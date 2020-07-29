import java.util.Arrays;

public class longestContinuousIncSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,4,7};
		System.out.println(longestContinuous(nums));
	}
	
	public static int longestContinuous(int[] nums) {
		if(nums.length == 0)
			return 0;
		
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		int max = 1;
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > nums[i-1]) {
				dp[i] = dp[i-1] + 1;
			}
			max = Math.max(max, dp[i]);
		}
		return max;
	}

}
