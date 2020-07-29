import java.util.*;
public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {2, 7, 8, 3, 1119};
			//System.out.println(largest(nums));
	}
	
	public static String largest(int[] nums) {
		if(nums.length == 0)
			return "";
		
		String allNums = "";
		for(int i = 0; i<nums.length;i++) {
			allNums += Integer.toString(nums[i]);
		}
		
		char[] digits = allNums.toCharArray();
		Arrays.sort(digits);
		
		allNums = "";
		for(int i = digits.length - 1; i >= 0; i--) {
			allNums += digits[i];
		}
		return allNums;
	}
	

}
