import java.util.*;
public class largestRangeAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100, 4, 200, 1, 3, 2};
		System.out.println(findLongestRange(nums));
	}
	
	public static int findLongestRange(int[] nums) {
		Map<Integer, Boolean> map = new HashMap<>();
		for(int num:  nums) {
			map.put(num, false);
		}
		
		int longestRange = 0;
		
		for(int num: nums) {
			int left = num - 1;
			int right = num + 1;
			int runningCount = 1;
			
			while(map.containsKey(left) && map.get(left) == false) {
				map.put(left, true);
				runningCount++;
				left--;
			}
			while(map.containsKey(right) && map.get(right) == false) {
				map.put(right, true);
				runningCount++;
				right++;
			}
			longestRange = Math.max(longestRange, runningCount);
		}
		return longestRange;
	}

}
