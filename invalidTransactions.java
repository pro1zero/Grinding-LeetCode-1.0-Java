import java.util.*;
public class invalidTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] transactions = {"alice,20,800,mtv","alice,50,100,beijing"};
		System.out.println(check(transactions));
	}
	
	public static List<String> check(String[] t){
		List<String> result = new ArrayList<>();
		
		if(t.length == 0)
			return result;
		
		if(t.length == 1) {
			result.add(t[0]);
			return result;
		}
		
		String[] names = new String[t.length];
		int[] time = new int[t.length];
		int[] amount = new int[t.length];
		String[] city = new String[t.length];
		
		for(int i = 0; i<t.length;i++) {
			String[] temp = t[i].split(",");
			names[i] = temp[0];
			time[i] = Integer.parseInt(temp[1]);
			amount[i] = Integer.parseInt(temp[2]);
			if(amount[i] > 1000) {
				result.add(t[i]);
			}
			city[i] = temp[3];
		}
		
		for(int i = 0; i<t.length;i++) {
			for(int j = 0; j<t.length;j++) {
				if(i == j) {
					continue;
				}
				else {
					if(names[i].equals(names[j]) && (Math.abs(time[i] - time[j]) <= 60) && !(city[i].equals(city[j]))) 
						if(!result.contains(t[i]))
								result.add(t[i]);						
				}
			}
		}
		return result;
	}

}
