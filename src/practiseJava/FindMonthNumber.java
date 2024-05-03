package practiseJava;

import java.util.Scanner;

public class FindMonthNumber {

    static Scanner input;

    public static void main(String[] args) {

        FindMonthNumber find = new FindMonthNumber();
        String checkResult = find.findMonth();
        
        while (checkResult.equals("Invalid input")) {
            checkResult = find.findMonth();
        }
    }

    public String findMonth() {

        input = new Scanner(System.in);
        System.out.println("Enter the month of your choice");
        String yourInput = input.next();

        switch (yourInput.toUpperCase()) {

            case "JANUARY":
                System.out.println("Month number of January is 1");
                break;
            case "FEBRUARY":
                System.out.println("Month number of February is 2");
                break;
            case "MARCH":
                System.out.println("Month 3");
                break;
            case "APRIL":
                System.out.println("Month 4");
                break;
            case "MAY":
                System.out.println("Month 5");
                break;
            case "JUNE":
                System.out.println("Month 6");
                break;
            case "JULY":
                System.out.println("Month 7");
                break;
            case "AUGUST":
                System.out.println("Month 8");
                break;
            case "SEPTEMBER":
                System.out.println("Month 9");
                break;
            case "OCTOBER":
                System.out.println("Month 10");
                break;
            case "NOVEMBER":
                System.out.println("Month 11");
                break;
            case "DECEMBER":
                System.out.println("Month 12");
                break;
            default:
                System.out.println("Invalid input, Please enter valid input");
                System.out.println("Restarting Again..");
                return "Invalid input";
        }
        
        // Return "Valid input" if the input is valid
        return "Valid input";
    }
}
