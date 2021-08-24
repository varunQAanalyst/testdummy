package secondseesion;

//template/blue print 
//object--state(variable) and behaviour(methods)
public class CarAttributes {
	
	//non static variable
	String carcolor="blue";
	
	//Static variable
	static String carmodel="ford";
	
	
	public void methodone() {
		System.out.println("one");
		methodtwo();
		methodone();
	}
	
	public static void methodtwo() {
		System.out.println("two");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(carmodel);
		methodtwo();
		
		//to call nonstatic 
		CarAttributes ca= new CarAttributes();
		ca.methodone();
		
	}
	

}
