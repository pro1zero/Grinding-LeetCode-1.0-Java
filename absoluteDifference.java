import java.util.*;
public class absoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,2,3};
		System.out.println(absolute(nums));
	}
	
	public static List<List<Integer>> absolute(int[] nums){
		List<List<Integer>> pairs = new ArrayList<>();
		if(nums.length == 0) {
			return pairs;
		}
		
		Arrays.sort(nums);
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<nums.length - 1;i++) {
			int diff = Math.abs(nums[i] - nums[i+1]);
			if(diff < min) {
				min = diff;
				pairs.clear();
				pairs.add(Arrays.asList(nums[i], nums[i+1]));
			}
			else if(diff == min) {
				pairs.add(Arrays.asList(nums[i], nums[i+1]));
			}
		}
		return pairs;
	}

}
