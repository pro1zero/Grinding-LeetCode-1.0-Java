import java.util.*;
public class breakAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(breakAnotherS("abe", "acd"));
		//System.out.println(usingMaps("abe", "acd"));
		//System.out.println(optimal("abc", "xya"));
	}
	
	public static boolean breakAnotherS(String s1, String s2) {
		if(s1.isEmpty())
			return true;
		char[] sOne = s1.toCharArray();
		char[] sTwo = s2.toCharArray();
		Arrays.sort(sOne);
		Arrays.sort(sTwo);
		
		
		boolean frontFlag = true, endFlag = true;
		for(int i = 0; i < sOne.length && (frontFlag || endFlag); i++) {
			if(sOne[i] > sTwo[i])
				frontFlag = false;
			if(sOne[i] < sTwo[i])
				endFlag = false;
		}
		return (frontFlag || endFlag);
	}
	//yet to implement
	public static boolean usingMaps(String s1, String s2) {
		if(s1.isEmpty())
			return true;
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(int i = 0; i < s1.length(); i++) {
			if(!map1.containsKey(s1.charAt(i))) {
				map1.put(s1.charAt(i), 1);
			}
			else {
				int p = map1.get(s1.charAt(i));
				map1.put(s1.charAt(i), ++p);
			}
			if(!map2.containsKey(s2.charAt(i))) {
				map2.put(s2.charAt(i), 1);
			}
			else {
				int p = map2.get(s2.charAt(i));
				map2.put(s2.charAt(i), ++p);
			}
			
		}
		
		for(Map.Entry<Character, Integer> entry: map1.entrySet()) {
			entry.getKey();
		}
		return true;
	}
	
	public static boolean optimal(String s1, String s2) {
		if(s1.isEmpty())
			return true;
		
		int[] one = new int[26];
		int[] two = new int[26];
		
		for(int i = 0; i < s1.length(); i++) {
			one[s1.charAt(i) - 'a']++;
			two[s2.charAt(i) - 'a']++;
		}
		boolean front = true, reverse = true;
		for(int i = 0; i < one.length; i++) {
			if(one[i] > two[i]) {
				reverse = false;
				break;
			}
		}
		for(int i = 0; i < one.length; i++) {
			if(one[i] < two[i]) {
				front = false;
				break;
			}
		}
		return front || reverse;
	}
}
