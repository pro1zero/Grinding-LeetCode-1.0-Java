
public class countLargestGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLongest(3853));
	}
	
	public static int findLongest(int n) {
		int[] sums = new int[37];
		int max = 0;
		for(int i = 1; i <= n; i++) {
			String s = Integer.toString(i);
			int sum = 0;
			for(int j = 0; j < s.length(); j++) {
				sum += Integer.parseInt(s.charAt(j) + "");
			}
			sums[sum]++;
			max = Math.max(max, sums[sum]);
		}
		int result = 0;
		for(int i: sums) {
			if(i == max) {
				result += 1;
			}
		}
		return result;
	}
}
