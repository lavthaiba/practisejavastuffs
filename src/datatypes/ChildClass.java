package datatypes;

import java.util.Scanner;

public class ChildClass  extends ParentClass{
	
	
	
	public static void main(String args[]) {
		
		ParentClass parentObj = new ParentClass();
		
		parentObj.name = "sdfsd";
		
		ParentClass parentObj1 = new ParentClass();
	
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter something to calculate its length"); String ask =
		 * input.next(); System.out.println(ask.length()); if(ask.equals("BIBEK")) {
		 * System.out.println("Matched"); }else { System.out.println("Not Matched"); }
		 */


		//System.out.println(a[6]);
		
		//System.out.println("Primitive data type of a : is"+a);
		
		String[] name = new String[15];
		name[0]=  "Bibek";
		name[1] = "Prasiddha";
		name[2] = "Bishes";
		name[3] = "Nisha";
		name[4] = "Rashmi";
		name[5] = "Swastika";
		name[6] ="Lav";
		
		/*
		 * for(int i=0; i<name.length;i++) { System.out.println(name[i]); }
		 */
		
		
		  for(String names: name) { 
			  System.out.println(names); 
			  }
		 
		
		
		
	}
	
	
	public void childDisplay() {
		
		display();
	}

}
