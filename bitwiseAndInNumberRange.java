
public class bitwiseAndInNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(bitwiseAnd(10, 12));
		System.out.println(bitwise(2147483646,2147483647));
	}
	
	
	
	public static String check(String s, String t) {
		String result = "";
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i) == '1' && t.charAt(i) == '1') {
				result += '1';
			}else {
				result += '0';
			}
		}
		return result;
	}
	
	
	public static int bitwise(int m, int n) {
		if(m == n)
			return m;
		
		String lastNum = Integer.toBinaryString(n);
		String result = Integer.toBinaryString(m);
		
		for(int i = m; i <= n; i++) {
			if(lastNum.length() != Integer.toBinaryString(i).length())
				return 0;
			
			result = check(result, Integer.toBinaryString(i));
		}
		
		return Integer.parseInt(result, 2);
	}
}
