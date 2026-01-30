import java.util.Scanner;

public class Practical22 {
    public static void main(String[] args) {
        Library library = new Library(3); // Initialize with 3 books
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAvailable Books: " + library.availableBooks);
            System.out.print("Enter number of books to issue (0 to exit): ");
            int count = scanner.nextInt();

            if (count == 0)
                break;

            try {
                library.issueBook(count);
            } catch (BookNotAvailableException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    public Library(int books) {
        this.availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}
