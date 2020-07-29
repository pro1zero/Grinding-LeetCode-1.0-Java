public class countNumberOfTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		System.out.println(calcRatings(nums));
	}
	
	public static int calcRatings(int[] nums) {
		if(nums.length < 3)
			return 0;
		int triplets = 0;
		for(int i = 0; i < nums.length; i++) {
			int leftSmaller = 0, leftBigger = 0;
			int rightSmaller = 0, rightBigger = 0;
			
			for(int j = 0; j < i; j++) {
				if(nums[j] > nums[i])
					leftBigger++;
				else if(nums[i] > nums[j]) {
					leftSmaller++;
				}
			}
			
			for(int k = i+1; k < nums.length; k++) {
				if(nums[k] > nums[i])
					rightBigger++;
				else if(nums[k] < nums[i]) {
					rightSmaller++;
				}
			}
			triplets += (leftSmaller*rightBigger) + (leftBigger*rightSmaller);
		}
		return triplets;
	}
}
