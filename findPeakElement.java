
public class findPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5};
		System.out.println(findPeak(nums));
	}
	
	public static int findPeak(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] > nums[i+1])
				return i;
		}
		return nums.length - 1;
	}

}
