package practiseJava;

import java.util.Scanner;

public class CheckOddEvenFromTwoInputs {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = input.nextInt();
		System.out.println("Enter second number");
		int secondNumber = input.nextInt();
		
		
		if(firstNumber %2==0) {
			
			System.out.println("First input number is EVEN");
		}else {
			System.out.println("First input number is ODD");
		}
		
		if(secondNumber %2 !=0) {
			System.out.println("Second Input number is ODD");
		}else {
			
			System.out.println("Second Input number is EVEN");
		}
		
		
	}

}
