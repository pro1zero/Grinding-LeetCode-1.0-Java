
public class countNegativeInSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{3,2},{1,0}};
		System.out.println(count(matrix));
	}
	
	public static int count(int[][] matrix) {
		int i = matrix.length;
		int j = matrix[0].length;
		int total = i*j;
		int result = 0;
		i = j = 0;
		while(i < matrix.length && j < matrix[0].length) {
			if(matrix[i][j] < 0) {
				i++;
				j = 0;
				continue;
			}
			if(matrix[i][j] >= 0) {
				result += 1;
			}
			j++;
			if(j == matrix[0].length) {
				i++;
				j = 0;
			}
		}
		return total - result;
	}
}
