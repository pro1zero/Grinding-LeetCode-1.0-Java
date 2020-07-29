
public class LuhnAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "4506445325175879";
		System.out.println(validation(number));
	}
	
	public static String validation(String s) {
		String reverse = "";
		boolean flag = true;
		for(int i = s.length() - 1;i>=0;i--) {
			if(flag) {
				flag =! flag;
				reverse += s.charAt(i);
			}
			else {
				flag =! flag;
				int a = Integer.parseInt(s.charAt(i) + "");
				a = a*2;
				if(a>=10)
					a = (a % 10) + 1;
				reverse += Integer.toString(a);
			}
		}
		String result = "";
		for(int i = reverse.length()-1;i>=0;i--) {
			result += reverse.charAt(i);
		}
		System.out.println(result);
		int sum = 0;
		for(int i = 0;i<result.length();i++) {
			sum += Integer.parseInt(result.charAt(i) + "");
		}
		int pin = sum%10;
		System.out.println(sum);
		if(pin == 0)
			return "VALID";
		else {
			int diff = 10 - pin;
			int last = Integer.parseInt(result.charAt(result.length() - 1) + "");
			return new String("INVALID " +(diff + last)%10);
		}
	}
}