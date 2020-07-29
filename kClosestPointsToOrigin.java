import java.util.*;
public class kClosestPointsToOrigin {

	public static void main(String[] args) {
		int[][] coordinates = {{3,3},{5,-1},{-2,4}};
		System.out.println(findClosest(coordinates, 2));
	}
	
	public static int[][] findClosest(int[][] points, int k){
		PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
		for(int[] point: points) {
			maxHeap.offer(point);
			if(maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		int[][] result = new int[k][2];
		while(k > 0) {
			result[--k] = maxHeap.poll();
		}
		return result;
	}
}
