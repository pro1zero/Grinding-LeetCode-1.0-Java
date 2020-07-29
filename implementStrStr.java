
public class implementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFirst("hello", "o"));
	}
	
	public static int findFirst(String haystack, String needle) {
		if(needle.length() == 0) return 0;
		
		for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			String temp = haystack.substring(i, i + needle.length());
			if(temp.equals(needle))
				return i;
		}
		return -1;
	}

}
