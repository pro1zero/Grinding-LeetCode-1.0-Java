
public class longestSubstringWithEvenVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLongest("bcbcbc"));
	}
	
	public static int findLongest(String s) {
		int longestLength = 0;
		for(int i = 0; i < s.length(); i++) {
			String temp = "";
			for(int j = i + 1; j <= s.length(); j++) {
				temp = s.substring(i,j);
				int runningLength = check(temp);
				longestLength = Math.max(longestLength, runningLength);
			}
		}
		return longestLength;
	}
	
	public static int check(String s) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for(int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if(c == 'a') {
				a++;
			}
			if(c == 'e') {
				e++;
			}
			if(c == 'i') {
				i++;
			}
			if(c == 'o') {
				o++;
			}
			if(c == 'u') {
				u++;
			}
		}
		return (a%2 == 0 && e%2 == 0 && i%2 == 0 && o%2 == 0 && u%2 == 0)?s.length():0;
	}
}
