
public class maximumScoreAfterSplittingTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "10000";
		System.out.println(maxScoreSplit(s));
	}
	
	
	public static int twoDirections(String s) {
		return 1;
	}
	
	
	public static int maxScoreSplit(String s) {
		if(s.length() < 2)
			return 0;
		
		String left = "";
		String right = "";
		int maxScore = 0;
		
		for(int i = 1; i<s.length();i++) {
			int score = 0;
			
			left = s.substring(0,i);
			right = s.substring(i, s.length());
			
			for(int j = 0; j < left.length(); j++) {
				char c = left.charAt(j);
				if(c == '0') {
					score++;
				}
			}
			
			for(int j = right.length() - 1; j >= 0; j--) {
				char c = right.charAt(j);
				if(c == '1') {
					score++;
				}
			}
			
			maxScore = Math.max(maxScore, score);
		}
		return maxScore;
	}

}
