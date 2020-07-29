
public class consecutiveNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(consecutiveSum(933320757));
	}
	
	public static int consecutiveSum(int n) {
		int count = 1;
		while(n%2 == 0)
			n/=2;
		
		for(int i = 3; i*i <= n; i += 2) {
			int runningCount = 0;
			while(n%i == 0) {
				n /= i;
				runningCount++;
			}
			count *= runningCount + 1;
		}
		return n == 1?count: count*2;
	}

}
