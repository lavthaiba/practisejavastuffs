package datatypes;

public class SubClass {
	
	public static void main(String[]args) {
		DataTypesInJava hello = new DataTypesInJava();
		hello.instanceVariable =3;
		System.out.println(DataTypesInJava.staticVariable);
		tearDown();
		hello.checkInstance();
		
		
		int number = 12;
		long numberLatest = (long)number+ 12;
		
		
		int newNumber = 233;
		Integer  numberAgain = Integer.parseInt("100");
		System.out.println(newNumber+numberAgain);
		
		
		
		System.out.println(newNumber+numberAgain);
		
		System.out.println(numberLatest);
	}
	
	
	public void display() {
		
		DataTypesInJava hello = new DataTypesInJava();

		System.out.println(hello.instanceVariable);
		System.out.println(hello.staticVariable);
		hello.checkInstance();
	}
	
	public static void tearDown() {
		System.out.println("I am tearown");
		
	}
	
	
	public void info() {
		
		System.out.println("i am info");
	}
	

}
