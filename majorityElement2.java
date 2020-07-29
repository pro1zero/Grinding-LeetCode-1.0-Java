// Only works for sorted arrays and output is in the form of a list of lists.

import java.util.*;
public class majorityElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,4},{4,5}};
		System.out.println(merge(intervals));
	}
	
	public static List<List<Integer>> merge(int[][] intervals){
		List<List<Integer>> result = new ArrayList<>();
		
		if(intervals.length == 0)
			return result;
		
		if(intervals.length == 1) {
			result.add(Arrays.asList(intervals[0][0], intervals[0][1]));
		}
					  
	    

		int i = 0;
		int start = intervals[i][0];
		int end = intervals[i][1];
		int e = end;
		while(i < intervals.length - 1) {
			if(intervals[i+1][0] > end) {
				result.add(Arrays.asList(start, end));
				i++;
				start = intervals[i][0];
				end = intervals[i][1];
				if(i == intervals.length - 1) {
					result.add(Arrays.asList(start, end));
					break;
				}
			}
			else {
				end = intervals[i+1][1];
				i++;
			}
		}
		if(end != e && result.isEmpty()) {
			result.add(Arrays.asList(start, end));
		}
		System.out.println(start);
		System.out.println(end);
		//System.out.println(result);
		return result;
	}

}
