
public class decodeWays {

	public static void main(String[] args) {
		System.out.println(decodeWay("226"));
	}
	
	public static int decodeWay(String s) {
		if(s.isEmpty()) return 0;
		int[] dp =  new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) == '0'?0:1;
		for(int i = 2; i < s.length() + 1; i++) {
			int oneDigit = Integer.valueOf(s.substring(i-1, i));
			int twoDigit = Integer.valueOf(s.substring(i-2, i));
			if(oneDigit >= 1 && oneDigit <= 9) {
				dp[i] += dp[i-1];
			}
			if(twoDigit >= 10 && twoDigit <= 26) {
				dp[i] += dp[i-2];
			}	
		}
		return dp[s.length()];
	}
}
