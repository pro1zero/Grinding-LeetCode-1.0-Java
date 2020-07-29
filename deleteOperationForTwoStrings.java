
public class deleteOperationForTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minDistance("sea", "eat"));
	}

	public static int minDistance(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for(int i = 0; i < s1.length() + 1; i++) {
			for(int j = 0; j < s2.length() + 1; j++) {
				dp[i][j] = j;
			}
			dp[i][0] = i;
		}
		for(int i = 1; i < s1.length() + 1; i++) {
			for(int j = 1; j < s2.length() + 1; j++) {
				if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + 1;
				}
			}
		}
		return dp[s1.length()][s2.length()];
	}
	//doesn't works fine for all test cases.
	public static int minDist(String s1, String s2) {
		int[] count = new int[26];
		for(int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			count[c - 'a']++;
		}
		for(int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			count[c - 'a']--;
		}
		int minDeletions = 0;
		for(int i = 0; i < count.length; i++) {
			minDeletions += Math.abs(count[i]);
		}
		return minDeletions;
	}
}