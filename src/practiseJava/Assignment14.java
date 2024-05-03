package practiseJava;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {

		
		double sum=0, average=0;		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		double firstInput = input.nextDouble();
		System.out.println("Enter second number");
		double secondInput = input.nextDouble();
		System.out.println("Enter third number");
		double thirdInput = input.nextDouble();
		System.out.println("Enter fourth number");
		double fourthInput = input.nextDouble();
		System.out.println("Enter fifth number");
		double fifthInput = input.nextDouble();
		
		sum = firstInput + secondInput + thirdInput + fourthInput + fifthInput;
		average = sum/5;
		System.out.println("Sum of five input numbers :"+ sum);
		System.out.println("Average of five input numbers :"+ average);
		
		
	}

}
