
public class longestPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLongest("abccccdd"));
	}
	
	public static int findLongest(String s) {
		if(s.isEmpty())
			return 0;
		int length = 0;
		
		for(int i = 0; i < s.length() - 1; i++) {
			int len1 = expandFromMiddle(s, i, i);
			int len2 = expandFromMiddle(s, i, i + 1);
			if(length < Math.max(len1, len2))
				length = Math.max(len1, len2);
		}
		
		return length;
	}
	
	public static int expandFromMiddle(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

}
