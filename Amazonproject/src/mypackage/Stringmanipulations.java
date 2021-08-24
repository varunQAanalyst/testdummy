package mypackage;

public class Stringmanipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="today is a fine day ";
		
		System.out.println(str.length());
		
		System.out.println(str.substring(3));
		
		System.out.println(str.substring(3, 17));
		
		
		System.out.println(str.indexOf('z'));
		System.out.println(str.charAt(3));
		
		
		//replace and replaceall
		System.out.println(str.replace('a', 'A'));
		System.out.println(str.replaceAll("fine", "bad"));
		
		
		System.out.println(str.trim());
		
		
		
		
		
	}

}
