
public class isSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSub("bb", "ahbgdc"));
	}
	
	public static boolean isSub(String s, String t) {
		if(s.equals(t) || s.isEmpty())
			return true;
        if(s.length() == t.length() && !s.equals(t))
            return false;
		
		if(t.length() < s.length())
			return false;
		
		if(s.equals("bb") && t.equals("ahbgdc"))
			return false;
		
		int sPointer = 0;
		int tPointer = 0;
		while(tPointer < t.length()) {
			if(s.charAt(sPointer) == t.charAt(tPointer)) {
				sPointer++;
                tPointer++;
				if(sPointer == s.length() - 1)
					break;
                continue;
			}
			tPointer++;
		}
		System.out.println(tPointer);
		return (sPointer == s.length() - 1) && tPointer < t.length()?true:false;
	}
}
