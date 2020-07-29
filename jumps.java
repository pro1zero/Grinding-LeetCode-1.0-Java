import java.util.Arrays;

public class jumps {
	public static void  main(String[] args) {
		int[] nums = {1,0,1,0};
		System.out.println(canJumpToLast(nums));
	}
	
	public static boolean canJumpToLast(int[] nums) {
		if(nums.length == 1)
			return true;
		if(nums.length > 1 && nums[0] == 0)
			return false;
		
		int[] dp =  new int[nums.length];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i = 1; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(j + nums[j] >= i) {
					dp[i] = Math.min(dp[i], dp[j] + 1);
				}
			}
		}
		System.out.println(Arrays.toString(dp));
		return dp[dp.length - 1] == Integer.MAX_VALUE || dp[dp.length- 1] == Integer.MIN_VALUE? false:true;
		
	}
}
