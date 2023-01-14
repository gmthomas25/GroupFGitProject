package classes;

public class StringEx {

	public static void halfSize(String str) {
		
	}
	
	public static String toUpper(String str) {
		String result = " ";
		
		return result;
	}
	
	public static String toLower(String str) {
		  String result = "";
	     result =   (str.toLowerCase());
		return result;
	}
	
	public static void equal(String str1, String str2) {
		if (str1.equals(str2)) {
			System.out.println(("Equals"));
		}else {
			System.out.println(("not Equals"));
			
		}
		
	}
	
	public static void reverse(String str) {
		  String reverse = "";
		    for(int i = str.length() - 1; i >= 0; i--) {
		        reverse = reverse + str.charAt(i);
		    }
		    
		
		
	}
	
	
	public static char findCharacter(String str, int index) {
		return ' ';
	}
	
	
	// if str>str2 then str shouldbe before str2
	public static String append(String str, String str2) {
		String result = " ";
		if (str== str2) {
			result = str2+ str;
		}else {
		
		}
		return "";
	}
}
