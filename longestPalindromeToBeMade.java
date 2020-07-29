import java.util.*;
public class longestPalindromeToBeMade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalinToBeMade("bbbbb"));
	}
	
	public static int longestPalinToBeMade(String s) {
		if(s.isEmpty())
			return 0;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}
			else {
				int p = map.get(s.charAt(i));
				map.put(s.charAt(i), ++p);
			}
		}
		
		int evenEntries = 0;
		boolean flag = false;
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			int temp = entry.getValue();
			if(temp%2 == 0) {
				evenEntries += temp;
			}
			else {
				flag = true;
				evenEntries += temp - 1;
			}
		}
		
		return flag == true? evenEntries + 1: evenEntries;
	}

}
