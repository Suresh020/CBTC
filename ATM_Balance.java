import java.util.Scanner;

class ATM {
    private double balance;

    public ATM() {
        balance = 100000.00; // Initial balance
    }

    // Display the ATM menu
    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
    }

    // Check and display the account balance
    public void checkBalance() {
        System.out.println("Your balance: INR " + balance);
    }

    // Perform a withdrawal operation
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("INR " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Perform a deposit operation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("INR " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Perform a transfer operation (simplified)
    public void transfer(double amount) {
        // Simplified transfer operation 
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("INR " + amount + " transferred successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
}

public class ATM_Balance {
    public static void main(String[] args) {
        Scanner suresh = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {
            atm.displayMenu();
            System.out.print("Select an option (1-5): ");
            int choice = suresh.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = suresh.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = suresh.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter transfer amount: $");
                    double transferAmount = suresh.nextDouble();
                    atm.transfer(transferAmount);
                    break;
                case 5:
                    System.out.println("Exiting ATM. Have a nice day!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
