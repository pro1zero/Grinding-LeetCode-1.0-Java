import java.util.*;
public class assignCookies {
	public static void main(String[] args) {
		int[] greed = {1,2};
		int[] cookies = {1,2,3};
		System.out.println(maxCookies(greed, cookies));
	}
	
	public static int maxCookies(int[] greed, int[] cookies) {
		Arrays.sort(greed);
		Arrays.sort(cookies);
		int i = 0;
		int j = 0;
		int content = 0;
		while(i < greed.length && j < cookies.length) {
			if(cookies[j] >= greed[i]) {
				content += 1;
				i++;
				j++;
			}else {
				j++;
			}
		}
		return content;
	}
}
