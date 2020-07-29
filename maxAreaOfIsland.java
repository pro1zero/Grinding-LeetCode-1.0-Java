import java.util.*;
public class maxAreaOfIsland {

	public static void main(String[] args) {
		int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
		                {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                {0,1,1,0,1,0,0,0,0,0,0,0,0},
		                {0,1,0,0,1,1,0,0,1,0,1,0,0},
		                {0,1,0,0,1,1,0,0,1,1,1,0,0},
		                {0,0,0,0,0,0,0,0,0,0,1,0,0},
		                {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		System.out.println(maxArea(grid));
	}
	
	public static int maxArea(int[][] grid) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		List<Integer> sizes = new ArrayList<>();
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(visited[i][j])
					continue;
				explore(grid, i, j, visited, sizes);
			}
		}
		int maxArea = 0;
		for(int size: sizes) {
			maxArea = Math.max(maxArea, size);
		}
		return maxArea;
	}
	
	public static void explore(int[][] grid, int i, int j, boolean[][] visited, List<Integer> sizes) {
		int currentSize = 0;
		Stack<int[]> stack = new Stack<>();
		stack.add(new int[] {i, j});
		while(!stack.empty()) {
			int[] nodes = stack.pop();
			i = nodes[0];
			j = nodes[1];
			if(visited[i][j])
				continue;
			visited[i][j] = true;
			if(grid[i][j] == 0)
				continue;
			currentSize += 1;
			List<int[]> unvisited = getUnvisited(i , j, grid, visited);
			for(int[] node: unvisited) {
				stack.add(node);
			}
		}
		if(currentSize > 0) {
			sizes.add(currentSize);
		}
	}
	
	public static List<int[]> getUnvisited(int i, int j, int[][] matrix, boolean[][] visited){
		List<int[]> unvisited = new ArrayList<>();
		if(i > 0 && !visited[i-1][j]) {
			unvisited.add(new int[] {i-1, j});
		}
		if(i < matrix.length - 1 && !visited[i+1][j]) {
			unvisited.add(new int[] {i+1, j});
		}
		if(j > 0 && !visited[i][j-1]) {
			unvisited.add(new int[] {i, j-1});
		}
		if(j < matrix[0].length - 1 && !visited[i][j+1]) {
			unvisited.add(new int[] {i, j+1});
		}
		return unvisited;
	}

}
