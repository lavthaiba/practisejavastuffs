package practiseJava;

import java.util.Scanner;

public class FindFingerName {

    Scanner input;

    public static void main(String[] args) {

        FindFingerName finalResult = new FindFingerName();
        finalResult.findFingerName(); 
    }

    public void findFingerName() {

        input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number from 1 - 5?");
            int yourInput;

            try {
                yourInput = input.nextInt();

                switch (yourInput) {

                    case 1:
                        System.out.println("Index Finger");
                        return; 
                    case 2:
                        System.out.println("Big Finger");
                        return;
                    case 3:
                        System.out.println("Ring Finger");
                        return;
                    case 4:
                        System.out.println("Tiny Finger");
                        return;
                    case 5:
                        System.out.println("Thumb Finger");
                        return;
                    default:
                        System.out.println("Invalid input. Please enter a number from 1 to 5.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine(); // Clear the input buffer
            }
        }
    }
}
