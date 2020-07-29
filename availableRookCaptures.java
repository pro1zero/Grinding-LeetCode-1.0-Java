
public class availableRookCaptures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] board = {{".",".",".",".",".",".",".","."},{".",".",".","p",".",".",".","."},{".",".",".","R",".",".",".","p"},{".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".","."},{".",".",".","p",".",".",".","."},{".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".","."}};
		System.out.println(findCaptues(board));
	}
	
	public static int findCaptues(String[][] board) {
		int[] rookPosition = {0,0};
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j].equals("R")) {
					rookPosition[0] = i;
					rookPosition[1] = j;
					break;
				}
			}
		}
		int captures = 0;
		int[] left = rookPosition;
		int[] right = rookPosition;
		int[] up = rookPosition;
		int[] down = rookPosition;
		while(left[1] >= 0) {
			if(board[left[0]][left[1]] == "R" || board[left[0]][left[1]] == ".") {
				left[1] -= 1;
			}
			else if(board[left[0]][left[1]] == "B") {
				break;
			}
			else if(board[left[0]][left[1]] == "p") {
				System.out.println("left");
				captures += 1;
				break;
			}
		}
		
		
		while(right[1] < 8) {
			if(board[right[0]][right[1]] == "R" || board[right[0]][right[1]] == ".") {
				right[1] += 1;
			}
			else if(board[right[0]][right[1]] == "B") {
				break;
			}
			else if(board[right[0]][right[1]] == "p") {
				System.out.println("right");
				captures += 1;
				break;
			}
		}
		
		while(up[0] >= 0) {
			if(board[up[0]][up[1]] == "R" || board[up[0]][up[1]] == ".") {
				up[0] -= 1;
			}
			else if(board[up[0]][up[1]] == "B") {
				break;
			}
			else if(board[up[0]][up[1]] == "p") {
				System.out.println("up");
				captures += 1;
				break;
			}
		}
		
		while(down[0] < 8) {
			if(board[down[0]][down[1]] == "R" || board[down[0]][down[1]] == ".") {
				down[0] += 1;
			}
			else if(board[down[0]][down[1]] == "B") {
				break;
			}
			else if(board[down[0]][down[1]] == "p") {
				System.out.println("down");
				captures += 1;
				break;
			}
		}
		return captures;
	}
}
