package secondseesion;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to access non static stuff
		CarAttributes carr= new CarAttributes();
		
		System.out.println(carr.carcolor);
		carr.carcolor="black";
		carr.methodone();
		
		System.out.println(CarAttributes.carmodel);
		CarAttributes.carmodel="Hyundai";
		CarAttributes.methodtwo();
		
		
	}

}
