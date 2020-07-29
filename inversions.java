import java.util.*;
public class inversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 5, 6,7,8};
		//System.out.println(naive(nums));
		System.out.println(optimal(nums));
	}
	
	public static int naive(int[] nums) {
		if(nums.length == 0)
			return 0;
		int count = 0;
		List<List<Integer>> pairs = new ArrayList<>();
		
		for(int i = 0; i<nums.length - 1;i++) {
			for(int j = i+1; j<nums.length;j++) {
				List<Integer> temp = new ArrayList<>();
				if(nums[i] > nums[j]) {
					count++;
					temp.add(nums[i]);
					temp.add(nums[j]);
				}
				pairs.add(temp);
			}
			
		}
		System.out.println(pairs);
		return count;
	}
	
	public static int optimal(int[] nums) {
		
		if(nums.length == 0)
			return 0;
		
		int left = 0;
		int right = nums.length - 1;
		int count = 0;
		
		while(left != nums.length - 1) {
			if(right == left) {
				left++;
				right = nums.length - 1;
			}
			
			if(nums[left] > nums[right]) {
				count++;
				right--;
				continue;
			}
			right--;
		}
		return count;
	}
}
