import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Creating new bank account...");
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        int accNumber = scanner.nextInt();
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();
        
        BankAccount account = new BankAccount(name, accNumber, initialBalance);
        System.out.println("\nAccount created successfully!");
      
        System.out.print("\nEnter deposit amount: ₹");
        account.deposit(scanner.nextInt());
        
        System.out.print("Enter withdrawal amount: ₹");
        account.withdraw(scanner.nextInt());

        System.out.println("\nCurrent Balance: ₹" + account.getBalance());
        String status = account.getBalance() >= 5000 ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        System.out.println("\nAccount Status: " + status);
        
        scanner.close();
    }
}