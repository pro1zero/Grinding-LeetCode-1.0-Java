
public class findWinnerTicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] moves = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
		System.out.println(findWinner(moves));
	}
	
	public static String findWinner(int[][] moves) {
		if(moves.length < 5)
			return "Pending";
		
		char[][] board = new char[3][3];
		boolean flag = true;
		
		for(int i = 0; i < moves.length; i++) {
			if(flag) {
				board[moves[i][0]][moves[i][1]] = 'x';
				flag =! flag;
			}else {
				board[moves[i][0]][moves[i][1]] = 'o';
				flag =! flag;
			}
		}
		
		for(int i = 0; i < board.length; i++) {
			String check = "";
			for(int j = 0; j < board.length; j++) {
				check += board[i][j];
			}
			if(check.equals("ooo"))
				return "B";
			else if(check.equals("xxx"))
				return "A";
		}
		
		for(int i = 0; i < board.length; i++) {
			String check = "";
			for(int j = 0; j < board.length; j++) {
				check += board[j][i];
			}
			if(check.equals("ooo"))
				return "B";
			else if(check.equals("xxx"))
				return "A";
		}
		
		String leftToRight = board[0][0] + "" +  board[1][1] + "" +  board[2][2] + "";
		if(leftToRight.equals("ooo"))
			return "B";
		else if(leftToRight.equals("xxx"))
			return "A";
		
		String rightToLeft = board[0][2] + "" + board[1][1] + "" + board[2][0] + "";
		if(rightToLeft.equals("ooo"))
			return "B";
		else if(rightToLeft.equals("xxx"))
			return "A";
		
		if(moves.length == 9)
			return "Draw";
		
		return "Pending";
	}
}
