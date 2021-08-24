package secondseesion;

public class Cookingitems {
	
	
	String itemone;
	int itemtwo;
	
	
	
	//constructor--used to initialise the value of object(state,behaviour)---(variables and methdos)
	//default constructor
	public Cookingitems(int a) {
		System.out.println("my implicit constructor");
		
	}

	
	
	//parameterized constructor
	public Cookingitems(String itemone,int itemtwo) {
		this(5);
		this.itemone=itemone;
		this.itemtwo=itemtwo;
		
	}
	
	
	
}
