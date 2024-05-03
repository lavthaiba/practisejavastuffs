package practiseJava;

public class FindingMaxNumbers {

	public static void main(String[] args) {

		int number1 = 50;
		int number2 = 70;
		int number3 = 290;
		
		/*
		 * if(number1> number2 && number1 > number3) {
		 * 
		 * System.out.println("Number1 is the greatest"); } else if(number2 > number1 &&
		 * number2 > number3) {
		 * 
		 * System.out.println("Number2 is the greatest"); }
		 * 
		 * else { System.out.println("Number3 is the greatest"); }
		 */
		
		if(number3> number2 && number3 > number1) {
			
			System.out.println("Number3 is the greatest");
		}
		else if(number2 > number3 && number2 > number1) {
			System.out.println("Number2 is the greatest");
		}
		else {
			System.out.println("Number1 is the greatest");
		}
	}

}
