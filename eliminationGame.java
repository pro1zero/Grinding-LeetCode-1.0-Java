
public class eliminationGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLast(50));
	}
	
	public static int findLast(int n) {
		if(n == 1)
			return 1;
		if(n < 6)
			return 2;		
		return (n%2 == 0)?n-2:n-3;
	}
}
