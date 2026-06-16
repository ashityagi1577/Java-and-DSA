import java.io.*;
import java.util.*;

// OOP Concept
class Account implements Serializable {

    private int accountNumber;
    private String name;
    private double balance;

    // Constructor
    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Amount");
        }

        balance += amount;
        System.out.println("Amount Deposited Successfully");
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful");
    }

    // Display Method
    public void display() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Name           : " + name);
        System.out.println("Balance        : " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class BankSystem{

    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // File Handling
    static void saveData() {

        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("bank.txt"));

            out.writeObject(accounts);

            out.close();

        } catch (Exception e) {
            System.out.println("Error Saving File");
        }
    }

    // File Handling
    @SuppressWarnings("unchecked")
    static void loadData() {

        try {
            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("bank.txt"));
                           

            accounts = (ArrayList<Account>) in.readObject();
            

            in.close();

        } catch (Exception e) {
            System.out.println("No Previous Data Found");
        }
    }

    public static void main(String[] args) {

        loadData();

        int choice;

        do {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Accounts");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Account Number : ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Balance : ");
                    double balance = sc.nextDouble();

                    accounts.add(new Account(accNo, name, balance));

                    System.out.println("Account Created");

                    break;

                case 2:

                    try {

                        System.out.print("Enter Account Number : ");
                        int depAcc = sc.nextInt();

                        for (Account a : accounts) {

                            if (a.getAccountNumber() == depAcc) {

                                System.out.print("Enter Amount : ");
                                double amt = sc.nextDouble();

                                a.deposit(amt);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 3:

                    try {

                        System.out.print("Enter Account Number : ");
                        int withAcc = sc.nextInt();

                        for (Account a : accounts) {

                            if (a.getAccountNumber() == withAcc) {

                                System.out.print("Enter Amount : ");
                                double amt = sc.nextDouble();

                                a.withdraw(amt);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 4:

                    for (Account a : accounts) {
                        a.display();
                    }

                    break;

                case 5:

                    saveData();

                    System.out.println("Data Saved");
                    System.out.println("Thank You");

                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}



