import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = null;

        while (true) {
            System.out.println("\n=== Banking System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    account = new Account(accNo, name, bal);
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Create account first.");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter withdraw amount: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Create account first.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        account.displayDetails();
                    } else {
                        System.out.println("No account created yet.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Banking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice. Try again.");
            }
        }
    }
}