import java.util.*;
public class generateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateAll(3));
	}
	
	public static List<String> generateAll(int n){
		Set<String> result = new HashSet<>();
		
		String parentheses = "";
		
		for(int i = 1; i <= n; i++) {
			parentheses += "()";
		}
		
		return null;
	}
}
