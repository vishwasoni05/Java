import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int isbn;

    public Book() {
    };
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {

        return "\nTitle: " + title + "\nAuthor: " + author + "\nBook Id: " + isbn;
    }

}

class Library {
    public ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();

        books.add(new Book("A Tale of Two Cities", "Charles Dickens", 1));
        books.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 2));
        books.add(new Book("The Alchemist", "Paulo Coelho", 3));
        books.add(new Book("Fear of Flying", "Erica Jong", 4));
        books.add(new Book("In the Heart of the Sea", "Nathaniel Philbrick", 5));
    }

   public void addBook(String title,String author,int isbn) {
       books.add(new Book(title, author, isbn));
       System.out.println("book added in the list successfuly!!!");
       System.out.println(books);

    }

    public void removeBooks(int id) {
        int flag = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() == id) {
                books.remove(i);
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Book remove successfully from the library");
        } else {
            System.out.println("Please enter valid id!!");
       }
        
    }

    public void listBooks() {
        System.out.println("Displaying available books in Library.");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
        }
    }

    public void searchForBook(String title) {
        int flag = 0;
        int ans = 0;
       
        for (int i = 0; i < books.size(); i++) {
            if ((books.get(i).getTitle()).compareTo(title)==0) {
                ans = i;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Book available in the library\n Title: "+books.get(ans).getTitle()+"\n Author: "+books.get(ans).getAuthor()+"\n Isbn: "+books.get(ans).getIsbn());
        } else {
            System.out.println("Book not found in the library.");
       }
       
    }

    public void updateBook(int isbn, String newTitle, String newAuthor) {
        int flag = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() == isbn) {
                books.get(i).setTitle(newTitle);
                books.get(i).setAuthor(newAuthor);
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Updated Book list: "+books);
        } else {
            System.out.println("Please try again!!");
        }
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }
}

public class ArrayListTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {
            System.out.println("\n1. Add Books in library");
            System.out.println("2. Remove book from library");
            System.out.println("3. ListOut the books available in library");
            System.out.println("4. if you want to search particular book");
            System.out.println("5. Update any book information");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBook(sc, library);
                    break;
                case 2:
                    removeBook(sc, library);
                    break;
                case 3:
                    library.listBooks();
                    break;
                case 4:
                    searchBook(sc, library);
                    break;
                case 5:
                    updateDetailsOfBook(sc, library);
                    break;
                default:
                    System.out.println("Enter valid Input!!!!");
            }
        } while (choice != 6);
        sc.close();
    }
    
    public static void addBook(Scanner sc, Library library) {
        String title;
        String author;
        int isbn;
        System.out.println("\n Enter how many books you want to add in the library:");
        int no_books = sc.nextInt();

        for (int i = 0; i < no_books; i++) {
            System.out.println("Enter the title of book:");
            title = sc.next();
            System.out.println("Enter the author name:");
            author = sc.next();
            System.out.println("Enter book Id: ");
            isbn = sc.nextInt();
            library.addBook(title, author, isbn);
        }

    }
    
    public static void removeBook(Scanner sc, Library library) {
        int id;
        ArrayList<Book> books = library.getBooks();
        System.out.println(books);
        System.out.println("Enter the book id you want to remove from library:");
        id = sc.nextInt();
        library.removeBooks(id);
    }

    public static void searchBook(Scanner sc, Library library) {
        String title;
        sc.nextLine();
        System.out.println("Enter the title of book you want to search:");
        title = sc.nextLine();

        System.out.println(title);
        library.searchForBook(title);
    }
    
    public static void updateDetailsOfBook(Scanner sc,Library library) {
        String title;
        String author;
        int id;

        System.out.println("Enter the id where you want to update information:");
        id = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the title of the book: ");
        title = sc.nextLine();

        sc.nextLine();
        System.out.println("Enter the author of the book: ");
        author = sc.nextLine();

        library.updateBook(id, title, author);
    }
}
