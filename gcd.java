
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculation(768, 864));
	}
	
	public static int calculation(int a, int b) {
		int result = 1;
		
		for(int i = result; i<=Math.min(a, b);i++) {
			if(a%i == 0 && b%i == 0)
				result = i;
		}
		return result;
	}

}
