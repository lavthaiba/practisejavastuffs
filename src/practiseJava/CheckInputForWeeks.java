package practiseJava;

import java.util.Scanner;

public class CheckInputForWeeks {

	
	static Scanner input;
	static int yourInput;
	public static void main(String[] args) {
		
		askForInputWeek();
		
	}
	
	
	public static void askForInputWeek() {
		input = new Scanner(System.in);
		System.out.println("Enter any number from 1 to 7");
		yourInput= input.nextInt();
		
		if(yourInput == 1) {
			System.out.println("sunday");
		}
		else if(yourInput==2) {
			System.out.println("Monday");
		}
		else if(yourInput==3) {
			
			System.out.println("Tuesday");
		}
		
		else if(yourInput==4) {
			System.out.println("Wednesday");
		}
		
		else if(yourInput==5) {
			System.out.println("Thursday");
		}
		
		else if(yourInput == 6) {
			
			System.out.println("Friday");
		}
		else if(yourInput == 7) {
			
			System.out.println("Saturday");
			
		}
		else {
			System.out.println("Invalid input");
			askForInputWeek();
			
		}
	}

}
