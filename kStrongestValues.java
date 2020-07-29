import java.util.Arrays;

public class kStrongestValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,-4,-6,-8,-9,-7,-5,-3,-1};
		System.out.println(medianSorted(nums,3));
	}
	
	public static int[] medianSorted(int[] nums, int k) {
		Arrays.sort(nums);
		int median = nums[(nums.length - 1)/2];
		int[] result = new int[k];
		System.out.println(median);
		int count = 0;
		int left = 0;
		int right = nums.length - 1;
		System.out.println(Arrays.toString(nums));
		while(count < k) {
			if(Math.abs(nums[left] - median) > Math.abs(nums[right] - median)) {
				result[count] = nums[left];
				left++;
			}
			else if(Math.abs(nums[left] - median) > Math.abs(nums[right] - median)) {
				result[count] = nums[right];
				right--;
			}
			else {
				if(nums[left] > nums[right]) {
					result[count] = nums[left];
					left++;
				}else {
					result[count] = nums[right];
					right--;
				}
			}
			count++;
		}
		System.out.println(Arrays.toString(result));
		return result;
	}

}
