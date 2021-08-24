package mypackage;

public class Operatorprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//+ - * / % < > <= == !=
		
		
	int a=10;
	int b=12;
	int c=a+b;
	
	System.out.println(c);
	
	int d=10+c;
	
	System.out.println(a-b);
	
	System.out.println(a*b);
	
	System.out.println(a>b);
	
	System.out.println(a==b);
	
	
	if (a>b) {
		System.out.println("yes ");
		///code write
	}else if(b>c){
		
		System.out.println("no");
	}else if(c>a) {
		System.out.println("true");
	}else {
		System.out.println("stay there");
	}
	
	
	int x=12;
	int y=12;
	
	
	if(x==y) {
		System.out.println("true yes");
	}else {
		
		
	}
	
	
	String s="varun";
	String s1="varun";
	
	System.out.println(s1);
	if(s==s1) {
		System.out.println("equals");
	}
	
	String s2= new String("varun");
		System.out.println(s2);
		
		System.out.println(s1==s2);
		
		
		
		if(s1.equals(s2)) {
			System.out.println("strings are qual");
		}
		
		
	}

}
