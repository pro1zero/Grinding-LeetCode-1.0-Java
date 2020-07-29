import java.util.*;
public class lastStoneWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2};
		System.out.println(findLast(nums));
	}
	
	public static int findLast(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = nums.length - 1; i >= 0; i--) {
			list.add(nums[i]);
		}
		
		while(list.size() > 1) {
			int stone1 = list.get(0);
			int stone2 = list.get(1);
			list.remove(1);
			list.remove(0);
			if(stone1 - stone2 != 0) {
				int diff = stone1 - stone2;
				list.add(diff);
			}
			Collections.sort(list);
			Collections.reverse(list);
		}
		return list.size() == 1?list.get(0):0;
	}
}
