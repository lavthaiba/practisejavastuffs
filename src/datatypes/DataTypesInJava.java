package datatypes;

import java.util.ArrayList;

import testclass.ArrayArrayList;

public class DataTypesInJava {

	int instanceVariable=32;
	static int staticVariable = 33;
	
public static void main(String args[]) {
	
	// PRIMITIVE DATA TYPES
		int intNum = 5833_2323;
		long creditcardNum = 1111_2332_2311_1234L;		
		boolean status = true;
		double doubleNum = 45.44;
		
		
		
		//NON-PRIMITIVE DATA TYPES
		String name = new String("Bibek");
		int[] rollNumber = new int[3];
		rollNumber[0] =58;
		rollNumber[1] = 7;
		rollNumber[2]=10;
		System.out.println(creditcardNum);
		
		for(int i=1;i<3; i++) {
			System.out.println(intNum);
		}
		
		for(int i=0; i<rollNumber.length; i++) {
			System.out.println("from array:"+rollNumber[i]);
			
		}
		
		System.out.println("lenght of string is:"+name.length());
		System.out.println("lenght of an array is:"+rollNumber.length);
}
	
public static void checkInstance() {
	
	System.out.println("i am static method");
}
	
}
