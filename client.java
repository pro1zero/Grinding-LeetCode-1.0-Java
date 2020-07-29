import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.*;

public class client {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		account acc = new account();
		while(true) {
		// TODO Auto-generated method stub
			DatagramSocket ds = new DatagramSocket();
			System.out.print("1. Getfirstname   2. SetFirstName ");
			String s = scan.nextLine();
			acc.setfirstName("jenish");
			byte[] b = ("1").getBytes();
			
			InetAddress ia = InetAddress.getLocalHost();
			DatagramPacket dp = new DatagramPacket(b, b.length,ia,9999);
			ds.send(dp);
			
			byte[] b1 = new byte[1024];
			DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
			ds.receive(dp1);
			
			String str = new String(dp1.getData());
			System.out.println("The output is: " + str.trim());
		}
	}

}
