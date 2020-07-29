
public class maximalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		System.out.println(calculateMaxSquareArea(matrix));
	}
	
	public static int calculateMaxSquareArea(char[][] matrix) {
		int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
		
		int maxLength = 0;
		for(int i = 1; i <= matrix.length; i++) {
			for(int j = 1; j <= matrix[0].length; j++) {
				if(matrix[i-1][j-1] == '1') {
					dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
					maxLength = Math.max(maxLength, dp[i][j]);
				}
			}
		}
		return maxLength*maxLength;
	}

}
