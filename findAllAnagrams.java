import java.util.*;
public class findAllAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findall("abab", "ab"));
	}
	
	public static List<Integer> findall(String s, String p){
		List<Integer> result = new ArrayList<>();
		if(s.isEmpty() || s == null)
			return result;
		
		char[] pSorted = p.toCharArray();
		Arrays.sort(pSorted);
		p = "";
		for(int i = 0; i<pSorted.length;i++) {
			p += pSorted[i];
		}
		
		for(int i = 0; i<s.length() - p.length() + 1;i++) {
			String temp = s.substring(i, i + p.length());
			char[] sortedString = temp.toCharArray();
			Arrays.sort(sortedString);
			temp = "";
			for(int j = 0; j<sortedString.length;j++) {
				temp += sortedString[j];
			}
			if(temp == p || p.equals(temp)) {
				result.add(i);
			}
		}
		return result;
	}

}
