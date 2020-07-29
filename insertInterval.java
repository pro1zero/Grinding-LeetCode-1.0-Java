import java.util.*;
public class insertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,2},{3,5},{12,16},{8,10},{6,7}};
		int[] toBeInserted = {4,8};
		
		System.out.println(insert(intervals, toBeInserted));
	}
	
	public static int[][] insert(int[][] intervals, int[] toBeInserted){
		List<int[]> interval = new ArrayList<>();
		interval.add(toBeInserted);
		
		for(int[] array: intervals) {
			interval.add(array);
		}
		
		Collections.sort(interval, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
		List<int[]> output = new ArrayList<>();
		
		int[] current = interval.get(0);
		output.add(current);
		
		for(int[] smallInterval: interval) {
			int currentEnd = current[1];
			int nextStart = smallInterval[0];
			int nextEnd = smallInterval[1];
			
			if(currentEnd >= nextStart) {
				current[1] = Math.max(currentEnd, nextEnd);
			}
			else {
				current = smallInterval;
				output.add(current);
			}
		}
		return output.toArray(new int[output.size()][]);
	}

}
