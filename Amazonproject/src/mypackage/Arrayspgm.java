package mypackage;

public class Arrayspgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="testone";
		int j=10;
		
		
		//Arrays---set of elements under the same data type---more than one data----
		
		String[] str=new String[3];
		str[0] ="one";
		str[1] ="two";
		str[2] ="three";
		
		int[] a= {212,122,123};
		//short form
		String[] st= {"one","two","three"};
		
		//general for loop
		for(int i=0;i<str.length;i++) {
			
			System.out.println(str[i]);
		}
		
		//foreach(arrays and collections)		
		for (String sa : st) {
			System.out.println(sa);
		}
		
		
		
		Object[] ob = new Object[4];
		ob[0]=12;
		ob[1]=12.32;
		ob[2]="yes";
		ob[3]=false;
		
		
		
		
	}

}
