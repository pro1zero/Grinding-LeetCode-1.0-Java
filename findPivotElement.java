import java.util.stream.*;
public class findPivotElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100, 500, 50, 50};
		System.out.println(findPivot(nums));
	}
	
	public static int findPivot(int[] nums) {
		int totalSum = IntStream.of(nums).sum();
		int currentSum = 0;
		for(int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			if(currentSum == totalSum - currentSum + nums[i])
				return i;
		}
		return -1;
	}
}