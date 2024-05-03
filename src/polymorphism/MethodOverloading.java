package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading calculate = new MethodOverloading();
		calculate.add(4, 8.0);
		calculate.add(4,4.0,9);
		calculate.add(2,4,9l);
		
		
	}
	
	public void add(int a, double b) {
		
		double result = a + b;
		System.out.println("Sum of two numbers are :"+ result);

	}
	
	public void add(int a, double b, int c) {
		
		double result = a + b + c;
		System.out.println("Sum of three numbers are:"+ result);
		
	}
	
	public void add(int a, int b, long c) {
		
		long result = a + b + c;
		System.out.println("sum of three numbers are: "+ result);
		
	}

}
