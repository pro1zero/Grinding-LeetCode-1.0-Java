import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class findKClosestElements {

	public static void main(String[] args) {
		System.out.println(findClosest(new int[] {0,1,1,1,2,3,6,7,8,9}, 9, 4));
	}
	
	public static List<Integer> findClosest(int[] nums, int k, int x){
		List<Integer> result = new ArrayList<>();
		if(x < nums[0]) {
			for(int i = 0; i < k; i++) {
				result.add(nums[i]);
			}
			return result;
		}else if(x > nums[nums.length - 1]) {
			for(int i = nums.length - 1; i >= 0; i--) {
				result.add(nums[i]);
			}
			return result;
		}
		else {
			int low = 0;
			int high = nums.length - 1;
			
			while(high - low >= k) {
				if(Math.abs(nums[low] - x) > Math.abs(nums[high] - x)) {
					low++;
				}else {
					high--;
				}
			}
			for(int i = low; i <= high; i++) {
				result.add(nums[i]);
			}
		}
		Collections.sort(result);
		return result;
	}
}