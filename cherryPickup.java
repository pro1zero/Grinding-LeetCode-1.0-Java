import java.util.Arrays;

public class cherryPickup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{0,0,-1}, {1,1,-1}, {1,1,1}};
		System.out.println(cherry(matrix));
	}
	
	public static int cherry(int[][] matrix) {
		int[][] dp = new int[matrix.length][matrix[0].length];
		
		boolean flag = false;
		
		//for rows
		for(int i = 0; i < matrix[0].length; i++) {
			if(flag) {
				dp[0][i] = -1;
				continue;
			}
			if(matrix[0][i] == -1) {
				dp[0][i] = -1;
				flag = true;
				continue;
			}
			if(i == 0) {
				dp[0][i] = matrix[0][i];
			}
			else {
				dp[0][i] = dp[0][i-1] + matrix[0][i];
			}
		}
		flag = false;
		
		for(int i = 0; i < matrix.length; i++) {
			if(flag) {
				dp[i][0] = -1;
				continue;
			}
			if(matrix[i][0] == -1) {
				dp[i][0] = -1;
				flag = true;
				continue;
			}
			if(i == 0) {
				dp[i][0] = matrix[i][0];
			}
			else {
				dp[i][0] = dp[i-1][0] + matrix[i][0];
			}
		}
		
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0; j < dp[i].length; j++) {
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 1; i < matrix.length; i++) {
			for(int j = 1; j < matrix[i].length; j++) {
				if(matrix[i][j] == -1) {
					dp[i][j] = -1;
					continue;
				}
				
				if(dp[i][j-1] == -1 && dp[i-1][j] == -1) {
					dp[i][j] = -1;
					continue;
				}
				dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]) + matrix[i][j];
			}
		}
		
		int totalCherries = dp[dp.length - 1][dp[0].length - 1];
		
		int row = dp[0].length, col = dp.length;
		return -1;
		
	}
}
