
public class excelSheetColumnTitle {

	public static void main(String[] args) {
		System.out.println(generateString(731));
	}
	
	public static String generateString(int n) {
		StringBuilder sb = new StringBuilder();
		
		while(n > 0){
			--n;
			sb.append((char) (n % 26 + 'A'));
			n /= 26;
		}
		return sb.reverse().toString();
	}
}
