import java.util.Arrays;

public class increasingTripletSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,0,0,0,10,0,0,0,100000000};
		System.out.println(findTriplet(nums));
	}
	
	public static boolean findTriplet(int[] nums) {
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		int longestSequence = Integer.MIN_VALUE;
		for(int i = 0; i < dp.length; i++) {
			int j = i-1;
			while(j >= 0) {
				if(nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);	
				}
				j--;
			}
			longestSequence = Math.max(longestSequence, dp[i]);
			if(longestSequence >= 3)
				return true;
		}
		
		return (longestSequence >= 3);
	}

}
