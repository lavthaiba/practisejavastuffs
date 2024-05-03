package variables;

import java.util.ArrayList;

public class dataTypes {
	

	int number = 2147447;
	int[] number11 = {2147483647,2332,2332};
	static int helloworld = 222;
	String name;
	long number1;
	
	int numberThird = 5;
	
	int[] numberFourth;
	
	ArrayList<String> abc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {232,23,2323,23232};
		
		
		System.out.println(helloworld);
		Integer  abcd = Integer.parseInt("123");
		Byte abc = Byte.parseByte("3");
		System.out.println(abc+abcd);
		int ccc = 23;
		int ddd;
		ddd= ccc+abcd;
		System.out.println("value is :" +ddd);
		helloworld();
		System.out.println(num);
		dataTypes myData = new dataTypes();
		
		myData.testMe();
		
		System.out.println(myData.number);

	}

	
	public void testMe() {

		int newNum;
		String name2;
		
		System.out.println(helloworld);
		
		System.out.println(abc);
		System.out.println(number);
		System.out.println(name);
		System.out.println(numberThird);
		helloworld();
		helloworldagain();
	}
	
	public static void helloworld() {
		
		System.out.println("hi");
	}
	
	public void helloworldagain() {
		testMe();
		System.out.println("hi hi");
	}
}
