
public class excelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNumber("FDGVABFG"));
	}
	
	public static int findNumber(String s) {
		int number = 0;
		int count = 0;
		for(int i = s.length() - 1; i >= 0 ; i--) {
			int getNum = s.charAt(i) - 64;
			int power = (int)Math.pow(26, count)*getNum;
			number += power;
			count += 1;
		}
		return number;
	}
}
