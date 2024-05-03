package librarymgmtsystem;

public class Book {
    // Attributes
    String ISBN;
    String title;
    String author;
    int availableCopies;

    // Display Information method
    public void displayInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available Copies: " + availableCopies);
        System.out.println("------------------");
    }

    // Check-out Book method
    public void checkOut(int copies) {
        if (copies > 0) {
            if (availableCopies >= copies) {
                if (availableCopies > 10) {
                    availableCopies -= 5;
                    System.out.println(copies + " copies checked out successfully! Available Copies decreased to: " + availableCopies);
                } else {
                    availableCopies += 5;
                    System.out.println(copies + " copies checked out successfully! Available Copies increased to: " + availableCopies);
                }
            } else {
                System.out.println("Cannot check out. Insufficient available copies.");
            }
        } else {
            System.out.println("Invalid number of copies to check out.");
        }
    }

    // Return Book method
    public void returnBook(int copies) {
        if (copies > 0) {
            availableCopies += copies;
            System.out.println(copies + " copies returned successfully! Available Copies increased to: " + availableCopies);
        } else {
            System.out.println("Invalid number of copies to return.");
        }
    }
}
