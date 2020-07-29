
public class countPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(2));
	}
	
	public static int count(int n) {
		int result = 0;
        
        for(int i = 2; i < n; i++){
        	boolean flag = true;
            for(int j = 2; j <= i/2; j++) {
            	if(i%j == 0) {
            		flag = false;
            		break;
            	}
            }
            if(flag)
            	result++;
        }
        return result;
	}
}
