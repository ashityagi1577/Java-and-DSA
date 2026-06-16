import java.io.*;
import java.util.*;

interface Library {
    void addBooks();
    void displayBooks();
    void issueBooks();
    void returnBooks();
}

class Books implements Serializable {
    int id;
    String name;
    String status;

    Books(int id, String name) {
        this.id = id;
        this.name = name;
        status = "Available";
    }

    void display() {
        System.out.println("Book ID : " + id);
        System.out.println("Book Name : " + name);
        System.out.println("Book Status : " + status);
    }
}

public class LibraryManagement implements Library {

    List<Books> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addBooks() {

        System.out.print("Enter Book ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        

        System.out.print("Enter Book Name : ");
        String name = sc.nextLine();

        books.add(new Books(id, name));

        System.out.println("Book Added");
    }

    public void issueBooks() {

        System.out.print("Enter Book ID : ");
        int id = sc.nextInt();

        for (Books b : books) {

            if (b.id == id) {

                if (b.status.equals("Available")) {
                    b.status = "Issued";
                    System.out.println("Book Issued");
                } else {
                    System.out.println("Already Issued");
                }
            }
        }
    }

    public void returnBooks() {

        System.out.print("Enter Book ID : ");
        int id = sc.nextInt();

        for (Books b : books) {

            if (b.id == id) {

                if (b.status.equals("Issued")) {
                    b.status = "Available";
                    System.out.println("Book Returned");
                } else {
                    System.out.println("Book Was Not Issued");
                }
            }
        }
    }

    public void displayBooks() {
        for (Books b : books) {
            b.display();
        }
    }

    void saveBooks() {
        try {
            FileOutputStream fos = new FileOutputStream("library.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(books);

            oos.close();
            fos.close();

            System.out.println("Books Saved");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        LibraryManagement obj = new LibraryManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n LIBRARY MENU");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Save Books");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    obj.addBooks();
                    break;

                case 2:
                    obj.issueBooks();
                    break;

                case 3:
                    obj.returnBooks();
                    break;

                case 4:
                    obj.displayBooks();
                    break;

                case 5:
                    obj.saveBooks();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
             sc.close();

        }
       
        
    }
     
    
}
