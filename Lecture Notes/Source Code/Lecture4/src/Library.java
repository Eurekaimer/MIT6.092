public class Library {
    String name;
    Book[] books;
    int numberofbook = 0; 
    private static final int MAX_BOOKS = 100; 

    //Instructor
    public Library(String address) {
        this.name = address;
        this.books = new Book[MAX_BOOKS]; 
    }

    public void addBook(Book book) {
        if (numberofbook < MAX_BOOKS) {
            books[numberofbook] = book;
            numberofbook++; 
            System.out.println("Added " + book.getTitle() + " to " + this.name);
        } else {
            System.out.println("The library " + this.name + " is full. Cannot add " + book.getTitle());
        }
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9 AM to 5 PM.");
    }

    public void printAddress() {
        System.out.println(this.name); 
    }

    public void borrowBook(String bookTitle) {
        boolean found = false;
        for (int i = 0; i < numberofbook; i++) {
            if (books[i].getTitle().equals(bookTitle)) {
                if (!books[i].isBorrowed()) {
                    books[i].borrowed();
                    System.out.println("You successfully borrowed " + bookTitle);
                    found = true;
                    break;
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public void returnBook(String bookTitle) {
        boolean found = false;
        for (int i = 0; i < numberofbook; i++) {
            if (books[i].getTitle().equals(bookTitle)) {
                if (books[i].isBorrowed()) {
                    books[i].returned();
                    System.out.println("You successfully returned " + bookTitle);
                    found = true;
                    break;
                } else {
                    System.out.println("This book was not borrowed from here.");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public void printAvailableBooks() {
        boolean anyAvailable = false;
        for (int i = 0; i < numberofbook; i++) {
            if (!books[i].isBorrowed()) {
                System.out.println(books[i].getTitle());
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No book in this library.");
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings"); // 再次尝试借阅，应该提示已借出
        secondLibrary.borrowBook("The Lord of the Rings"); // 从第二个图书馆借阅，应该提示不在目录中
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}