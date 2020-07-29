
public class longestSubStringWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLongest("pwwkew"));
	}
	
	public static int findLongest(String s) {
		if(s.length() == 0 || s.isEmpty())
			return 0;
		int maxLength = 0;
		for(int i = 0; i<s.length();i++) {
			String check = "";
			for(int j = i; j<s.length();j++) {
				if(check.contains(s.charAt(j) + "")) {
					break;
				}
				else {
					check += s.charAt(j);
					maxLength = Math.max(maxLength, check.length());
				}
			}
		}
		return maxLength;
	}

}
