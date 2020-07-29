
public class implementSQRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(implementSQRT(100));
	}
	
	public static int implementSQRT(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		int x = n/4;
		int sqrt = x;
		
		for(int i = x; i < n/2; i++) {
			if(i*i <= n) {
				sqrt = i;
			}
			else {
				break;
			}
		}
		return sqrt;
	}

}
