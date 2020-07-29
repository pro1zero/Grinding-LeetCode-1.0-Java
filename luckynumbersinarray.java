import java.util.*;
public class luckynumbersinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		System.out.println(lucky(a));
	}
	
	public static List<Integer> lucky(int[][] a){
		List<Integer> result = new ArrayList<>();
		if(a.length == 0)
			return result;
		
		boolean[][] mins = new boolean[a.length][a[0].length];
		boolean[][] maxs = new boolean[a.length][a[0].length];
		for(int i = 0; i<a.length;i++) {
			int min = Integer.MAX_VALUE;
			int index = 0;
			for(int j = 0;j<a[i].length;j++) {
				if(a[i][j] < min) {
					min = a[i][j];
					index = j;
				}
			}
			mins[i][index] = true;
		}
		
		for(int i = 0; i<a[0].length;i++) {
			int max = Integer.MIN_VALUE;
			int index = 0;
			for(int j = 0;j<a.length;j++) {
				if(a[j][i] > max) {
					max = a[j][i];
					index = j;
				}
			}
			maxs[index][i] = true;
		}

		for(int i = 0; i<mins.length;i++) {
			for(int j = 0; j<mins[0].length;j++) {
				if(mins[i][j] == true && maxs[i][j] == true)
					result.add(a[i][j]);
			}
		}
		return result;
	}

}
