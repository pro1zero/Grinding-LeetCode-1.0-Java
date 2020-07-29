import java.util.*;
public class isHoppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] towers = {1,0,1,1,1,1};
		System.out.println(isHopp(towers));
	}
	
	public static boolean isHopp(int[] towers){
		boolean[] dp = new boolean[towers.length + 1];
		dp[0] = true;
		for(int i = 0; i < towers.length; i++) {
			int steps = towers[i];
			if(steps == 0)
				continue;
			int j = i+1;
			while(j <= towers.length && steps > 0) {
				dp[j++] = true;
				steps--;
			}
			if(!dp[i])
				break;
		}
		System.out.println(Arrays.toString(dp));
		return dp[towers.length];
	}
}
