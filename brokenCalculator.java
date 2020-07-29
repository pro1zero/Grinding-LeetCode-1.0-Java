
public class brokenCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(brokenCalc(2,3));
	}
	
	public static int brokenCalc(int x, int y) {
		
		if(x >= y)
			return x - y;
		
		int steps = 0;
		
		while(y > x) {
			steps++;
			
			if(y%2 == 0)
				y /= 2;
			else
				y += 1;
		}
		return steps + x - y;
	}
}
