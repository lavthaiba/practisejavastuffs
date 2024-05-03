package practiseJava;

import java.util.Scanner;

public class TakeInputandProcessFive {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		double total=0.0;
		double average= 0.0;
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Enter first number");
		double firstNumberInput = input.nextDouble();
		System.out.println("Enter second number");
		double secondNumberInput = input.nextDouble();
		System.out.println("Enter third number");
		double thirdNumberInput = input.nextDouble();
		System.out.println("Enter Fourth number");
		double fourthNumberInput = input.nextDouble();
		System.out.println("Enter fifth, the last number");
		double fifthNumberInput = input.nextDouble();
		
		total = firstNumberInput + secondNumberInput +
				thirdNumberInput + fourthNumberInput + fifthNumberInput;
		
		average = total/5.0;
		
		System.out.println("The sum of five number inputs :"+ total);
		System.out.println("The average of five number inputs :"+ average);
	}

}
