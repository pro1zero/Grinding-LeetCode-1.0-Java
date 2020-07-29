
public class decodeStringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decode("y959q969u3hb22odq595", 222280369)); 
	}
	
	public static String decode(String s, int k) {
		String result = "";
		for(int i = 0; i<s.length();i++) {
			if(result.length() >= k + 1)
				break;
			String temp = "";
			char c = s.charAt(i);
			if(!Character.isDigit(c)) {
				result += c;
				
			}	
			else {
				temp = result;
					for(int j = 0;j < (Integer.parseInt(c + "") - 1);j++) {
						if(result.length() >= k + 1)
							break;
						
						result += temp;
						
					}
			}
		}
		
		
		return (result.charAt(k - 1) + "");
	}

}
