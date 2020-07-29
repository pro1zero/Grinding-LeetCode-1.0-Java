import java.util.Arrays;

public class jumpGameTwo {

	public static void main(String[] args) {
		int[] nums = {1,0,1,0};
		System.out.println(jumpGame(nums));
	}
	
	public static boolean jumpGame(int[] nums) {
		int[] dp = new int[nums.length];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i = 1; i < nums.length; i++) {
			int j = 0;
			while(j < i) {
				if(nums[j] + j >= i) {
					dp[i] = Math.min(dp[i], dp[j] + 1);
				}
				j++;
			}
		}
		System.out.println(dp[dp.length - 1]);
		return Math.abs(dp[dp.length - 1]) >= nums.length ? false: true;
	}
	
	

}
