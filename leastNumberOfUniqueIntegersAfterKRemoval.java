import java.util.*;
public class leastNumberOfUniqueIntegersAfterKRemoval {

	public static void main(String[] args) {
		int[] nums = {2,4,1,8,3,5,1,3};
		System.out.println(kRemovals(nums, 3));
	}
	
	public static int kRemovals(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int num: nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a, b) -> map.get(a) - map.get(b));
		for(int num: map.keySet()) {
			heap.offer(num);
		}
		while(k > 0 && !heap.isEmpty()) {
			k -= map.get(heap.poll());
		}
		return k < 0 ? heap.size() + 1: heap.size();
	}
}
