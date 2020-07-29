import java.util.Arrays;

public class createTargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		int[] index = {0};
		
		System.out.println(create(nums, index));
	}
	
	public static String create(int[] nums, int[] index) {
		int[] result = new int[nums.length];
		Arrays.fill(result, Integer.MIN_VALUE);
		
		for(int i = 0; i<nums.length;i++) {
			int indice = index[i];
			if(result[indice] == Integer.MIN_VALUE){
				result[indice] = nums[i];
			}
			else {
				shift(result, nums, nums[i], indice);
			}
			
		}
		return Arrays.toString(result);
	}
	
	public static void shift(int[] result, int[] nums, int numToInsert, int indice) {
		int temp = result[indice];
		result[indice] = numToInsert;
		indice += 1;
		while(result[indice] != Integer.MIN_VALUE) {
			int scar = result[indice];
			result[indice] = temp;
			temp = scar;
			indice += 1;
		}
		result[indice] = temp;
	}

}
