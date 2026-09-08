import java.util.Scanner;

class Bank {
    String name;
    int accountNumber;
    double balance;

    void createAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();

        System.out.println("Account created successfully!");
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Bank customer = new Bank();

        customer.createAccount();

        for (int i = 1; i <= 10; i++) {

            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                customer.deposit();

            } else if (choice == 2) {
                customer.withdraw();

            } else if (choice == 3) {
                customer.checkBalance();

            } else if (choice == 4) {
                customer.displayAccount();

            } else if (choice == 5) {
                System.out.println("Thank you for using our bank!");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
