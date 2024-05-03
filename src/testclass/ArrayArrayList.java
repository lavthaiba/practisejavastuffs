package testclass;

import java.util.ArrayList;

public class ArrayArrayList {

	public static void main(String[] args) {

		String[] name = new String[10];
		name[0] = "Lav Thaiba";
		name[1]= "Bishesh";
		name[2] = "Nisha";
		name[3] = "Devendra";
		name[4] = "Swastika";
		name[5] = "Prasidha";
		name[6] = "Bharat";
		name[7] = "Rashmi";
		name[8] = "Bibek";
		
		
		for(int i=0; i< 4; i++) {
			System.out.println(name[i]);
		}
		
		for(String names: name) {
			System.out.println(names);
		}
		
		ArrayList genericObject = new ArrayList();
		genericObject.add("Hello world!");
		genericObject.add("My Roll no. is: ");
		genericObject.add(11);
		
		ArrayList<String> stringCollection = new ArrayList<String>();
		stringCollection.add("Hello world!");
		stringCollection.add("Thanks for visit");
		stringCollection.add("Goodbye");
		
		for(Object obj1: genericObject) {
			System.out.println(obj1);
		}
		
		
		for(String obj1:stringCollection) {
			System.out.println(obj1);
		}
	}
	
	
	
}
