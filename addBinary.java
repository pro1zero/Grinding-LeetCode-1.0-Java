
public class addBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinNums("1001", "1"));
	}
	
	public static String addBinNums(String num1, String num2) {
		StringBuffer sb = new StringBuffer();
		
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		
		int carry = 0;
		
		while (i >= 0 || j >= 0) {
			int sum = carry;
			
			if(i >= 0) {
				sum += num1.charAt(i--) - '0';
			}
			
			if(j >= 0) {
				sum += num2.charAt(j--) - '0';
			}
			
			sb.insert(0, sum%2);
			carry = sum/2;
		}
		
		if(carry != 0) {
			sb.insert(0, 1);
		}
		return sb.toString();
	}

}
