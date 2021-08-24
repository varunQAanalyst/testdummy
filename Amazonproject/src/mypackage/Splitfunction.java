package mypackage;

public class Splitfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "today:is: a:good day";
		
		String[] st=str.split("a");
		
		//direct
		System.out.println(st[2]);
		
		
		
		//dynamic for
		for(String s:st) {
			System.out.println(s);
		}
		
	}

}
