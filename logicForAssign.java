import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class logicForAssign {
	static List<String> names = new ArrayList<>();
	static Hashtable<Character, Set<String>> data = new Hashtable<>();
	static int online;
	static int offline;
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		for(String name: names) {
			char key = name.charAt(0);
			if(data.containsKey(key)) {
				Set<String> temp = data.get(key);
				temp.add(name.toLowerCase());
				data.put(key, temp);
			}else {
				Set<String> temp = new HashSet<>();
				temp.add(name.toLowerCase());
				data.put(key, temp);
			}
		}
		offline = names.size();
		online = 0;
		String asia = "182.";
		String america = "132.";
		String europe = "93.";
		System.out.println("From which of the below continent do you belong?");
		System.out.println("1. North America");
		System.out.println("2. Europe");
		System.out.println("3. Asia");
		System.out.println("Enter 1 for US, 2 for EUROPE and 3 for ASIA");
		String continent = "";
		continent = scan.nextLine();
		int choice = Integer.parseInt(continent.trim());
		String temp = "";
		String ip = "";
		if(choice == 1) {
			temp = Integer.toString(100 + rand.nextInt(100)) + "." + Integer.toString(100 + rand.nextInt(100)) + "." + Integer.toString(100 + rand.nextInt(100));
			ip = america + temp;
		}
		else if(choice == 2) {
			temp = Integer.toString(100 + rand.nextInt(100)) + "." + Integer.toString(100 + rand.nextInt(100)) + "." + Integer.toString(100 + rand.nextInt(100));
			ip = europe + temp;
		}else {
			temp = Integer.toString(100 + rand.nextInt(100)) + "." + Integer.toString(100 + rand.nextInt(100)) + "." + Integer.toString(100 + rand.nextInt(100));
			ip = asia + temp;
		}
		System.out.println(ip);
		createAccount("addy", "son", 44, "addyson", "88888", ip); 
		createAccount("maddy", "sone", 444, "addys23", "88888", ip); 
		createAccount("daddy", "sorn", 414, "addyson234", "88888", ip); 
		createAccount("daddy", "sonr", 454, "ad345dyson", "88888", ip); 
		createAccount("daddy", "sotn", 4, "a654ddyson", "88888", ip); 
	}
	
	public static void createAccount(String firstName, String lastName, int age, String username, String password, String ip) {
		if(username.length() < 6 || username.length() >15) {
			System.out.println("Please enter valid username(6 <= LENGTH <= 15)");
			return;
		}
		if(names.contains(username.toLowerCase())) {
			System.out.println("This username already exist. Please choose another username.");
			return;
		}
		names.add(firstName.toLowerCase());
		if(data.containsKey(firstName.toLowerCase().charAt(0))) {
			Set<String> temp = data.get(firstName.toLowerCase().charAt(0));
			temp.add(firstName.toLowerCase());
			data.put(firstName.toLowerCase().charAt(0), temp);
		}else {
			Set<String> temp = new HashSet<>();
			temp.add(firstName.toLowerCase());
			data.put(firstName.toLowerCase().charAt(0), temp);
		}
		System.out.println("Names: " + names);
		System.out.println("New account created. " + data);
	}
	
	public static void playerSignIn(String username, String password, String ip) {
		
	}
	
	public static void signOut(String username, String ip) {
		
	}
	
	public static void getPlayerStatus(String username, String password, String ip) {
		
	}
}
