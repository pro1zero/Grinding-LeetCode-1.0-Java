import java.util.*;
public class letterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		System.out.println(letterCombinations(""));
	}
	
	public static List<String> letterCombinations(String s){
		if(s.isEmpty())
			return new ArrayList<>();
		Map<Character, String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		List<String> result = new ArrayList<>();
		result.add("");
		for(int i = s.length() - 1; i >= 0; i--) {
			char currentChar = s.charAt(i);
			String values = map.get(currentChar);
			List<String> answers = new ArrayList<>();
			for(String ans: result) {
				for(char c: values.toCharArray()) {
					String temp = c + ans;
					answers.add(temp);
				}
			}
			result.addAll(answers);
		}
		List<String> lc = new ArrayList<>();
		for(int i = 0; i < result.size(); i++) {
			if(result.get(i).length() == s.length()) {
				lc.add(result.get(i));
			}
		}
		return lc;
	}

}
