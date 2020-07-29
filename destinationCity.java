import java.util.*;
public class destinationCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> trips = new ArrayList<>();
		trips.add(Arrays.asList("B", "C"));
		trips.add(Arrays.asList("D", "B"));
		trips.add(Arrays.asList("C", "A"));
		
		System.out.println(findDest(trips));
	}
	
	public static String findDest(List<List<String>> trips) {
		if(trips.size() == 0)
			return "";
		
		List<String> destinations = new LinkedList<>();
		
		for(List<String> pair: trips) {
			String s = pair.get(1);
			destinations.add(s);
		}
		
		for(List<String> pair: trips) {
			String s = pair.get(0);
			destinations.remove(s);
		}
		return destinations.get(0);
	}

}
