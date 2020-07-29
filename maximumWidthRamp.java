
public class maximumWidthRamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1};
		System.out.println(maxWidth(nums));
	}
	
	public static int maxWidth(int[] nums) {
		int i = 0;
		int j = nums.length - 1;
		
		int maxWidth = 0;
		boolean flag = true;
		
		while(i < j) {
			if(nums[i] > nums[j]) {
				if(flag) {
					i++;
					flag =! flag;
					continue;
				}
				else {
					j--;
					flag =! flag;
					continue;
				}
			}
			else {
				int front = i;
				maxWidth = Math.max(maxWidth, j - i);
				while(i >= 0) {
					if(nums[i] <= nums[j]) {
						maxWidth = Math.max(maxWidth, j - i);
					}
					i--;
				}
				
				while(j < nums.length) {
					if(nums[front] <= nums[j]) {
						maxWidth = Math.max(maxWidth, j - front);
					}
					j++;
				}
				break;
			}
		}
		return maxWidth;
	}
}
