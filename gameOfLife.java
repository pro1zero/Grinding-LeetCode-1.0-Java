
public class gameOfLife {

	public static void main(String[] args) {
		int[][] board = {{0,1,0}, {0,0,1},{1,1,1},{0,0,0}};
		gameOfLifes(board);
	}
	
	public static void gameOfLifes(int[][] board) {
		int[][] output = new int[board.length][board[0].length];
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				int ones = visitNeighbours(i, j, board);
				if(ones < 2 || ones >= 4) {
					output[i][j] = 0;
				}
				else if(ones == 3 && board[i][j] == 0) {
					output[i][j] = 1;
				}
				else {
					output[i][j] = board[i][j];
				}
			}
		}
		
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = output[i][j];
			}
		}
	}
	
	public static int visitNeighbours(int i, int j, int[][] board) {
		int ones = 0;
		
		if(j-1 >= 0 && board[i][j-1] == 1) {
			ones += 1;
		}
		if(i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1) {
			ones += 1;
		}
		if(i+1 < board.length && j-1 >= 0 && board[i+1][j-1] == 1) {
			ones += 1;
		}
		if(i-1 >= 0 && board[i-1][j] == 1) {
			ones += 1;
		}
		if(i+1 < board.length && board[i+1][j] == 1) {
			ones += 1;
		}
		if(j+1 < board[0].length && board[i][j+1] == 1) {
			ones += 1;
		}
		if(i-1 >= 0 && j+1 < board[0].length && board[i-1][j+1] == 1) {
			ones += 1;
		}
		if(i+1 < board.length && j+1 < board[i].length && board[i+1][j+1] == 1) {
			ones += 1;
		}
		return ones;
	}

}
