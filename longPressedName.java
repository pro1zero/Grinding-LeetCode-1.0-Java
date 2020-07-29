
public class longPressedName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("alex", "aalexx"));
	}
	
	public static boolean check(String n, String t) {
		if(n.equals(t)) return true;
		if(n.length() > t.length()) return false;
		String s = "";
		int j = 0;
		for(int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			while(j < t.length()) {
				if(c != t.charAt(j)) {
					j++;
				}
				else {
					s += t.charAt(j);
					j++;
					break;
				}
			}
		}
		System.out.println(s);
		return (n.equals(s))?true: false;
	}

}
 	