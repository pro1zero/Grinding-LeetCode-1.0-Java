import java.util.Arrays;
import java.util.stream.*;
public class candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ratings = {1,0,2};
		System.out.println(distributeCandies(ratings));
	}
	
	public static int distributeCandies(int[] ratings) {
		if(ratings.length == 0)
			return 0;
		
		int[] minCandies = new int[ratings.length];
		Arrays.fill(minCandies, 1);
		
		for(int i = 1; i < ratings.length; i++) {
			if(ratings[i] > ratings[i-1]) {
				minCandies[i] = minCandies[i-1] + 1;
			}
		}
		
		for(int i = ratings.length - 1; i > 0; i--) {
			if(ratings[i-1] > ratings[i]) {
				minCandies[i-1] = Math.max(minCandies[i] + 1, minCandies[i-1]);
			}
		}
		return IntStream.of(minCandies).sum();
	}

}
