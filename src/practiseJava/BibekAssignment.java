package practiseJava;

import java.util.Scanner;

public class BibekAssignment {
	

	public static void main(String[] args) {
		Scanner input;
		int fingerNumber;
		String fingerName;
		
		input = new Scanner(System.in);
		System.out.println("Please input a number to find each finger name: ");
		
		do {
			
		fingerNumber = input.nextInt();
			
		switch (fingerNumber) {
		case 1:
			fingerName = "Index finger";
			System.out.println("Number one finger name is "+ fingerName );
			break;
			
		case 2:
			fingerName = "Big finger";
			System.out.println("Number two finger name is "+ fingerName);
			break;
			
		case 3:
			fingerName = "Ring finger";
			System.out.println("Number three finger name is "+ fingerName);
			break;
			
		case 4:
			fingerName = "Pinky finger";
			System.out.println("Number four finger name is "+ fingerName);
			break;
			
		case 5:
			fingerName = "Thumb finger";
			System.out.println("Number fifth finger name is "+ fingerName);
			break;

		default:
			System.out.println("Invalid Number.");
			System.out.println("Please enter a number again between 1-5.");
			break;
			
		}
		} while (fingerNumber>5);
		
	}

}


