import java.util.*;
public class maxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10, -10, 5, 20, 10};
		System.out.println(findMax(nums));
	}
	
	public static int findMax(int[] nums) {
		Arrays.sort(nums);
		
		return nums[0]*nums[1]*nums[nums.length - 1] > nums[nums.length - 1]*nums[nums.length - 3]*nums[nums.length - 3]?nums[0]*nums[1]*nums[nums.length - 1]:nums[nums.length - 1]*nums[nums.length - 3]*nums[nums.length - 3];
	}

}
