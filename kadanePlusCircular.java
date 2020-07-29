import java.util.*;
public class kadanePlusCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,-3,5};
		System.out.println(plusVersion(nums));
	}
	
	public static int plusVersion(int[] nums) {
		if(nums.length == 1)
			return nums[0];
		
		int[] dp = new int[nums.length + 1];
		int maxSum = Integer.MIN_VALUE;
		for(int i = 1; i <= nums.length; i++) {
			if(i == nums.length) {
				int lastSum = Math.max(dp[i-1] + nums[i-1], nums[i-1]);
				dp[i] = lastSum;
				//System.out.println(Arrays.toString(dp));
				if(true){
					int newSum = nums[i-1];
					int running = newSum;
					int j = 0;
					while(j < nums.length - 1) {
						running += nums[j++];
						newSum = Math.max(newSum, running);
					}
					System.out.println("newsum" + newSum);
					dp[i] = Math.max(dp[i], newSum);
					maxSum = Math.max(dp[i], maxSum);
					break;
				}
			}
			
			
			dp[i] = Math.max(dp[i-1] + nums[i-1], nums[i-1]);
			maxSum = Math.max(dp[i], maxSum);
		}
		System.out.println(Arrays.toString(dp));
		return maxSum;
	}
}
