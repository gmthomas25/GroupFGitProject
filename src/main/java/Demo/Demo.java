package Demo;


import classes.StringEx;

public class Demo {

	public static void main(String[] args) {
		
		
		String str1 = "Window";
		String str2 = "houses";
		String str3 = "door";
		int index = 3;
		
		StringEx.halfSize(str1);
		
		System.out.println(StringEx.toUpper(str2));
		
		StringEx.equal(str1, str2); // equal
		StringEx.equal(str3, str2); // not equal
		
		System.out.println(StringEx.reverse(str3));
		
		System.out.println(StringEx.findCharacter(str2, index));
		
		
		System.out.println(StringEx.append(str1, str2));
		
		
	}
}
