import java.util.*;
public class canPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,0,1};
		System.out.println(canPlace(nums,1));
	}
	
	public static boolean canPlace(int[] nums, int n) {
		if(n > nums.length || nums.length == 0)
			return false;
		if(nums.length == 1 && nums[0] == 0 && n == 1)
			return true;
		
		for(int i = 0; i < nums.length; i++) {
			if(i == 0) {
				if(nums.length > 1 && nums[i] == 0 && nums[i+1] == 0) {
					n--;
					nums[i] = 1;
					continue;
				}
			}
			else if(i == nums.length - 1) {
				if(n <= 0)
					return true;
				
				if(nums[i - 1] == 0 && nums[i] == 0) {
					n--;
					nums[i] = 1;
					continue;
				}
			}
			else if(nums[i - 1] == 0 && nums[i + 1] == 0 && nums[i] == 0) {
				n--;
				nums[i] = 1;
			}
		}
		System.out.println(Arrays.toString(nums));
		return (n == 0);
	}

}
