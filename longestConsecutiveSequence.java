import java.util.*;
public class longestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,4,200,1,2,3};
		System.out.println(lcs(nums));
		System.out.println(mostOptimal(nums));
	}
	
	public static int lcs(int[] nums) {
		if(nums.length == 0)
			return 0;
		Map<Integer, Boolean> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], true);
		}
		int longestSequence = 0;
		for(int i = 0; i < nums.length; i++) {
			if(!map.get(nums[i]))
				continue;
			map.put(nums[i], false);
			int runningSequence = 1;
			int left = nums[i] - 1;
			int right = nums[i] + 1;
			while(map.containsKey(left)) {
				map.put(nums[i], false);
				runningSequence += 1;
				left--;
			}
			while(map.containsKey(right)) {
				map.put(nums[i], false);
				runningSequence += 1;
				right++;
			}
			longestSequence = Math.max(longestSequence, runningSequence);
		}
		return longestSequence;
	}
	
	public static int mostOptimal(int[] nums) {
		if(nums.length == 0)
			return 0;
		
		Set<Integer> set = new HashSet<>();
		for(int num: nums)
			set.add(num);
		int ans = 0;
		for(int num: nums) {
			if(!set.contains(num - 1)) {
				int curr = 1;
				int no = num;
				while(set.contains(no+1)) {
					no += 1;
					curr += 1;
				}
				ans = Math.max(ans, curr);
			}
		}
		return ans;
	}
}
