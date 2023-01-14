package classes;

public class StringEx {
	
	
	/**
	 * This method returns half the size of the given string
	 * @param str this is the string that will give the size
	 */
	public static void halfSize(String str) {
		int size = str.length();
		
		System.out.println(size/2);
	}
	
	/**
	 * This method will return the string in uppercase
	 * @param str
	 * @return
	 */
	public static String toUpper(String str) {
		String result = "";
		
		result = str.toUpperCase();		
		return result;
	}
	
	
	
	/**
	 * This method will return the string in lowercase
	 * @param str
	 * @return
	 */
	public static String toLower(String str) {
		  String result = "";
	     result =   (str.toLowerCase());
		return result;
	}
	
	
	/**
	 * this method tells me if the two strings are equal
	 * @param str1
	 * @param str2
	 */
	public static void equal(String str1, String str2) {
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println(("Equals"));
		}else {
			System.out.println(("not Equals"));
			
		}
		
	}
	
	
	/**
	 * reverses the string
	 * @param str
	 * @return
	 */
	public static String reverse(String str) {
		  String reverse = "";
		    for(int i = str.length() - 1; i >= 0; i--) {
		        reverse = reverse + str.charAt(i);
		    }
		  
//		  StringBuffer result = new StringBuffer(str);
//		  result = result.reverse();
//		  reverse = result.toString();
		    

			  return reverse;
		
	}
	
	/**
	 * return the charater at index
	 * @param str
	 * @param index
	 * @return
	 */
	public static char findCharacter(String str, int index) {
		char result = ' ';
		result = str.charAt(index);
		return result;
	
	}
	
	
	// if str>str2 then str shouldbe before str2
	public static String append(String str, String str2) {
		String result = " ";
		if (str.length()>str2.length()) {
			result = str+ str2;
		}else {
			result = str2 + str;
		}
		return result;
	}
}
