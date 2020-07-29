import java.util.*;
public class kThSmallestInSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2},{1,3}};
		System.out.println(findSmallest(matrix, 2));
	}
	
	public static int findSmallest(int[][] matrix, int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				heap.offer(matrix[i][j]);
			}
		}
		int total = matrix.length*matrix[0].length;
		System.out.println(heap);
		for(int i = total; i > k; i--) {
			heap.poll();
		}
		return heap.poll();
	}
}
