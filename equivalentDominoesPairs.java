import java.util.*;
public class equivalentDominoesPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dominoes = {{1,2}, {2,1}, {3,4}, {5,6}};
		System.out.println(findEqui(dominoes));
	}
	
	public static int findEqui(int[][] dominoes) {
		Set<int[]> set = new HashSet<>();
		List<int[]> nums = new ArrayList<>();
		for(int[] i: dominoes) {
			Arrays.sort(i);
			nums.add(i);
		}
		
		for(int[] i: nums) {
			set.add(i);
		}
		return dominoes.length - set.size();
	}

}
