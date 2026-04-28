public class Account {
    int accountNumber;
    String holderName;
    double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

}
