import java.util.*;
public class increasingDecreasingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rat";
		System.out.println(ordering(s));
	}
	
	public static String ordering(String s) {
		if(s.isEmpty() || s == null)
			return "";
		String result = "";
		char[] sorted = s.toCharArray();
		boolean[] flags = new boolean[sorted.length];
		Arrays.sort(sorted);
		
		while(result.length() != s.length()) {
			char previous = '1';
			char largest = '9';
			for(int i = 0; i<sorted.length;i++) {
				if(!flags[i]) {
					result += sorted[i];
					flags[i] =! flags[i];
					previous = sorted[i];
					break;
				}
			}
			if(result.length() == s.length())
				break;
			
			for(int i = 0; i<sorted.length;i++) {
				if(!flags[i] && sorted[i] > previous) {
					result += sorted[i];
					flags[i] =! flags[i];
					previous = sorted[i];
				}
			}
			
			if(result.length() == s.length())
				break;
			
			for(int i = sorted.length - 1; i>=0;i--) {
				if(!flags[i]) {
					result += sorted[i];
					flags[i] =! flags[i];
					largest = sorted[i];
					break;
				}
			}
			
			for(int i = sorted.length-1;i>=0; i--) {
				if(!flags[i] && sorted[i] < largest) {
					result += sorted[i];
					flags[i] =! flags[i];
					largest = sorted[i];
				}
			}
		}
		return result;
	}

}
