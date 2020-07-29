import java.util.*;
public class kidsWithGreatestNumOfCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies = {4,2,1,1,2};
		System.out.println(greatestCandies(candies, 1));
	}
	
	public static List<Boolean> greatestCandies(int[] candies, int extraCandies){
		List<Boolean> greatest = new ArrayList<>();
		
		if(candies.length == 0)
			return greatest;
		
		int peak = Integer.MIN_VALUE;
		
		for(int i = 0; i < candies.length; i++) {
			peak = Math.max(peak, candies[i]);
		}
		
		for(int i = 0; i < candies.length; i++) {
			if(candies[i] + extraCandies >= peak)
				greatest.add(true);
			else
				greatest.add(false);
		}
		return greatest;
	}

}
