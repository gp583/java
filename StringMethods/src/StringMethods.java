
public class StringMethods {

	public static void main(String[] args) {
		String amanda = "Amanda";
		String alex = "Alex";
		String guilio = "Guilio";
		String keenan = "Keenan";
		
		System.out.println(reverse(alex));
		System.out.println(addSpaces(guilio));
		System.out.println(encrypt(keenan,3));
		System.out.println(scramble(amanda));

	}

	public static String reverse(String str){
		int i;
		String ans = "";
		
		for (i = str.length()-1; i >= 0; i--){
			ans = ans + str.charAt(i);
		}
/*		for (i = 0; i < str.length(); i++){
			ans = str.charAt(i) + ans;		
		}
*/		return ans;
	}

	public static String addSpaces(String str){
		String ans = "";
		int i;
		
		for (i = 0; i < str.length(); i++){
			ans = ans + str.charAt(i) + " ";
		}
		ans = ans.substring(0,ans.length()-1); 
/*		for (i = 0; i < str.length()-1; i++){
			ans = ans + str.charAt(i) + " ";
		}
		ans += str.charAt(i);
*/		
		return ans;
	}

	public static String encrypt(String str, int loc){
		String ans = "";
		int i;
		
		for (i = 0; i < str.length(); i++){
			ans += (char) ((int)str.charAt(i) + loc);
		}
		return ans;	
	}

	public static String scramble(String str) {
		return "scramble";
	}
	}
