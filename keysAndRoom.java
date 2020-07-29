import java.util.*;
public class keysAndRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> rooms = new ArrayList<>();
		rooms.add(List.of(2));
		rooms.add(List.of());
		rooms.add(List.of(1));
		
		System.out.println(allRooms(rooms));
	}
	
	public static boolean allRooms(List<List<Integer>> rooms) {
		boolean[] flags = new boolean[rooms.size()];
		flags[0] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		while(!stack.isEmpty()) {
			int node = stack.pop();
			for(int key: rooms.get(node)) {
				if(!flags[key]) {
					flags[key] = true;
					stack.push(key);
				}
			}
		}
		
		for(boolean flag: flags) {
			if(!flag)
				return false;
		}
		return true;
	}

}
