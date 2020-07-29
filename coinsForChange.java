import java.util.Arrays;

public class coinsForChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2};
		System.out.println(coinChange(coins, 3));
	}
	
	public static int coinChange(int[] coins, int change) {
		int[] dp = new int[change + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		int toCompare = 0;
		for(int coin: coins) {
			for(int amount = 1; amount <= change; amount++) {
				if(coin <= amount) {
					if(dp[amount - coin] == Integer.MAX_VALUE) {
						toCompare = dp[amount - coin];
					}else {
						toCompare = dp[amount - coin] + 1;
					}
					dp[amount] = Math.min(toCompare, dp[amount]);
				}
			}
		}
		return dp[change] == Integer.MAX_VALUE?-1: dp[change];
	}
}
