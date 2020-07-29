import java.util.*;
public class fourSumNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7, 6, 4, -1, 1, 2};
		System.out.println(calcFourSum(nums, 16));
	}
	
	public static List<Integer[]> calcFourSum(int[] nums, int target){
		List<Integer[]> result = new ArrayList<>();
		if(nums.length < 4)
			return result;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 3; i++) {
			for(int j = i + 1; j < nums.length - 2; j++) {
				int left = j + 1;
				int right = nums.length - 1;
				while(left < right) {
					if(nums[i] + nums[j] + nums[left] + nums[right] == target) {
						Integer[] quadruple = {nums[i], nums[j], nums[left], nums[right]};
						result.add(quadruple);
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
		return result;
	}
}
