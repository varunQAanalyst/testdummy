package secondseesion;

public class Cooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cookingitems items = new Cookingitems();//constructor --invoke
		
		System.out.println(items.itemone);
		System.out.println(items.itemtwo);
		
		//items.itemone="knife";
		
		Cookingitems itemcons= new Cookingitems("onion",12);
		System.out.println(itemcons.itemone);
		System.out.println(itemcons.itemtwo);
	}

}
