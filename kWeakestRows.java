import java.util.*;

public class kWeakestRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
		System.out.println(findWeakest(nums, 2));
	}
	
	public static int[] findWeakest(int[][] nums, int k) {
		if(nums.length == 0 || k < 1)
			return new int[] {};
		int[] scores = new int[nums.length];
		int j = 0;
		for(int[] array: nums) {
			int score = 0;
			for(int i: array) {
				if(i == 1) {
					score++;
				}
				else {
					break;
				}
			}
			scores[j++] = score;
			score = 0;
		}
		
		int[] result = new int[k];
		j = 0;
		while(k-- > 0) {
			int minNum = Integer.MAX_VALUE;
			int index = 0;
			for(int i = 0; i < scores.length; i++) {
				if(scores[i] < minNum) {
					minNum = Math.min(minNum, scores[i]);
					index = i;
				}
			}
			result[j++] = index;
			scores[index] = Integer.MAX_VALUE;
			
		}
		return result;
	}
}
