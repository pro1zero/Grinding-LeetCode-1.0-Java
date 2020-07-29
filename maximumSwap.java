
public class maximumSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSwap(12322329));
		//tryStr();
	}
	
	
	
	public static void tryStr() {
		String s = "2736";
		for(int i = 0; i < s.length() - 1; i++) {
			for(int j = i + 1; j < s.length(); j++) {
				
			}
		}
		System.out.println();
	}
	public static int maxSwap(int num) {
		int[] dp = new int[Integer.toString(num).length()];
		int max = 0;
		String s = Integer.toString(num);
		for(int i = 0; i < s.length() - 1; i++) {
			dp[i] = num;
			for(int j = i + 1; j < s.length(); j++) {
				String str = "";
				str = s.substring(0,i) + s.charAt(j) + s.substring(i+1, j) + s.charAt(i) + s.substring(j+1);
				//System.out.println(str);
				int newNum = Integer.parseInt(str);
				if(newNum > dp[i]) {
					dp[i] = newNum;
				}
			}
			max = Math.max(max, dp[i]);
		}
		return max;
	}

}
