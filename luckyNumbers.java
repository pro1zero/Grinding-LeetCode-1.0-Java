import java.util.*;
public class luckyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,3,3,3};
		System.out.println(lucky(nums));
	}
	
	public static int lucky(int[] nums) {
		if(nums.length == 0)
			return 0;
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		for(int i = 0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}
			else {
				int p = map.get(nums[i]);
				map.put(nums[i], ++p);
			}
			if(map.get(nums[i]) == nums[i]) {
				result.add(nums[i]);
			}
		}
		int max = -1;
		for(int i: result) {
			if(map.get(i) == i) {
				max = Math.max(max, i);
			}
		}
		return max;
	}

}
