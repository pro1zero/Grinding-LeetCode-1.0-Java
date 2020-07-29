import java.util.PriorityQueue;

public class kLargestElementInArray {

	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		System.out.println(kLargest(nums, 2));
	}
	
	public static int kLargest(int[] nums, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
		for(int i = 0; i < nums.length; i++) {
			maxHeap.add(nums[i]);
			if(maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		return maxHeap.poll();
	}

}
