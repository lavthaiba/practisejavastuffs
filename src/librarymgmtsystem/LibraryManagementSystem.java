package librarymgmtsystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {
    	
        // Create an array to store information for five books
        Book[] books = new Book[5];

        // Initialize the array with some default book data
        books[0] = new Book();
        books[0].ISBN = "122ASD";
        books[0].title = "Java Programming";
        books[0].author = "Bisesh";
        books[0].availableCopies = 5;

        books[1] = new Book();
        books[1].ISBN = "SHG568";
        books[1].title = "Digital Logic";
        books[1].author = "Rashmi";
        books[1].availableCopies = 10;

        books[2] = new Book();
        books[2].ISBN = "SHG528";
        books[2].title = "Prashiddha";
        books[2].author = "Devendra";
        books[2].availableCopies = 15;

        books[3] = new Book();
        books[3].ISBN = "SHL568";
        books[3].title = "Operating Systems";
        books[3].author = "Bibek";
        books[3].availableCopies = 20;

        books[4] = new Book();
        books[4].ISBN = "SHB561";
        books[4].title = "Database Management System";
        books[4].author = "Nisha";
        books[4].availableCopies = 0;

        // Display the initial information of all books
        System.out.println("Initial Information of Books:");
        for (Book book : books) {
            book.displayInfo();
        }

        // Check out operations for each book in the array
        for (int i = 0; i < books.length; i++) {
            System.out.println("Check Out Operations for Book " + (i + 1) + ":");
            books[i].checkOut(5); // Check out 5 copies
            books[i].displayInfo(); // Display information after the checkout operation
        }

        // Return operations for each book in the array
        for (int i = 0; i < books.length; i++) {
            System.out.println("Return Operations for Book " + (i + 1) + ":");
            books[i].returnBook(5); // Return 5 copy
            books[i].displayInfo(); // Display information after the return operation
        }
    }
}
