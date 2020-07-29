import java.util.*;
public class fourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-3,-2,-1,0,0,1,2,3};
		System.out.println(calculateFourSum(nums, 0));
	}
	
	public static List<List<Integer>> calculateFourSum(int[] nums, int target){
		Set<List<Integer>> result = new HashSet<>();
		Arrays.sort(nums);
		
		for(int i = 0;  i < nums.length - 3; i++) {
			for(int j = i + 1; j < nums.length - 2; j++) {
				int left = j + 1;
				int right = nums.length - 1;
				while(left < right) {
					if(nums[i] + nums[j] + nums[left] + nums[right] == target) {
						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						left++;
					}
					else if(nums[i] + nums[j] + nums[left] + nums[right] < target) {
						left++;
						continue;
					}
					else {
						right--;
						continue;
					}
				}
			}
		}
		List<List<Integer>> temp = new ArrayList<>(result);
 		return temp;
	}

}
