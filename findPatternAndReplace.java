import java.util.*;

public class findPatternAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
		System.out.println(replaceStrings(words, "abb"));
	}
	
	public static List<String> replaceStrings(String[] words, String pattern){
		List<String> result = new ArrayList<>();
		for(int i = 0; i < words.length; i++) {
			if(match(words[i], pattern)) {
				result.add(words[i]);
			}
		}
		return result;
	}
	
	public static boolean match(String word, String pattern) {
		Map<Character, Character> map = new HashMap<>();
		for(int i = 0; i < word.length(); i++) {
			char p = pattern.charAt(i);
			char w = word.charAt(i);
			
			if(!map.containsKey(w)) {
				map.put(w, p);
			}
			if(map.get(w) != p)
				return false;
		}
		
		boolean[] seen = new boolean[26];
		for(char c: map.values()) {
			if(seen[c-'a']) {
				return false;
			}else {
				seen[c-'a'] = true;
			}
		}
		return true;
	}
}
