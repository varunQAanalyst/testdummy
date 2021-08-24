package mypackage;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=10;//increment ------expected i---+1
		
		
		int j=i++;
		System.out.println(j);
		
		
		
		
		
		
		
		
		System.out.println(i++);//output 11------------------10
		System.out.println(i);//output 11
		
		System.out.println(++i);//output 12
		System.out.println(i);//12
	}

}
