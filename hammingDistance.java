
public class hammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hamming(400, 1));
	}
	
	public static int hamming(int i, int j) {
		String one = Integer.toBinaryString(i);
		String two = Integer.toBinaryString(j);
		String temp = "";
		if(one.length() < two.length()) {
			int count = two.length() - one.length();
			for(int k = 0; k<count;k++) {
				temp += "0";
			}
			one = temp + one;
		}else {
			int count = one.length() - two.length();
			for(int k = 0; k<count;k++) {
				temp += "0";
			}
			two = temp + two;
		}
		int result = 0;
		for(int k = 0;k<one.length();k++) {
			if(one.charAt(k) != two.charAt(k))
				result++;
		}
		return result;
	}

}
