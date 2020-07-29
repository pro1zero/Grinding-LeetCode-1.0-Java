
public class longestPeakInMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,2};
		System.out.println(longest(nums));
	}
	
	public static int longest(int[] nums) {
		int longestPeak = 0;
		
		for(int i = 1; i < nums.length - 1; i++) {
			int currentPeak = 0;
			if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
				currentPeak += 1;
				int left = i - 1;
				while(left >= 0 && nums[left] < nums[left + 1]) {
					currentPeak += 1;
					left--;
				}
				int right = i + 1;
				while(right < nums.length && nums[right] < nums[right - 1]) {
					currentPeak += 1;
					right++;
				}
			}
			longestPeak = Math.max(longestPeak, currentPeak);
		}
		return longestPeak;
	}
}
