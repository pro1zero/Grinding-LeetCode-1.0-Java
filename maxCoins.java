
public class maxCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{0,3,1,1}, {2,0,0,4}, {1,5,3,1}};
		System.out.println(findMaxCoins(matrix));
	}
	
	public static int findMaxCoins(int[][] matrix) {
		int[][] dp = new int[matrix.length][matrix[0].length];
		int sum = 0;
		for(int i = 0; i < matrix[0].length; i++) {
			dp[0][i] = matrix[0][i] + sum;
			sum += matrix[0][i];
		}
		sum = 0;
		for(int i = 0; i < matrix.length; i++) {
			dp[i][0] = matrix[i][0] + sum;
			sum += matrix[i][0];
		}
		for(int i = 1; i < matrix.length; i++) {
			for(int j = 1; j < matrix[i].length; j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + matrix[i][j];
			}
		}
		
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0; j < dp[i].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

}
