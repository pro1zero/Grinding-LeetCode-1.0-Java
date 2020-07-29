import java.util.*;
public class isomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isomorphic("ab", "aa"));
	}
	
	public static boolean isomorphic(String s, String t) {
		if(s.isEmpty() || s.equals(t))
			return true;
		
		Map<Character, Character> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), t.charAt(i));
			}
			else {
				if(map.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
				continue;
			}
		}
		
		Set<Character> set = new HashSet<>();
		for(char c: map.values()) {
			if(!set.contains(c))
				set.add(c);
			else
				return false;
		}
		return true;
	}

}
