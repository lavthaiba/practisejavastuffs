package practiseJava;

import java.util.Scanner;

public class CheckPositiveNumberFromGivenNumber {

	public static void main(String[] args) {
			
		
		//int givenNumber[] = {1,3,5,-5,-33,6,-4554};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter any number");
		int yourInput = input.nextInt();
	
		if(yourInput >=0 ) {
			
			System.out.println("positive number");
			
		}else
		{
			System.out.println("Negative number");
		}
		
		
	}

}
