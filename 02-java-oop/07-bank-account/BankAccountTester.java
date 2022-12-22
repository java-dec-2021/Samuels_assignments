// Defining Test File Class with Noun naming Convention
public class BankAccountTester {
    // Entry Point Method, Starts my Application
    public static void main(String[] args) {
        // Off of the BankAccount Class I am Instantiating a Instance of a BankAccount
        BankAccount sammy = new BankAccount();
        System.out.println("This is the total number of Bank Accounts " + BankAccount.getTotalNumberOfAccounts());
        sammy.depositChecking(300);
        System.out.println("This is the Checking for Sammy: " + sammy.getChecking());
        sammy.withdrawChecking(400);
        System.out.println("This is the Checking for Sammy: " + sammy.getChecking());
        sammy.depositSavings(300);
        System.out.printf("This is the Savings for Sammy: %s", sammy.getSavings() + "\n");
        sammy.withdrawSavings(400);
        System.out.println("This is the Savings for Sammy " + sammy.getSavings());
        System.out.println(sammy.getTotalOfBothAccounts());
        // These are Commented out because they involve a Private Static (Class) Method
        // System.err.println(sammy.getAccountNumber());
        // BankAccounts.setAccountNumber("500");
        // System.out.println(sammy.getAccountNumber());

        BankAccount sammie = new BankAccount();
        System.out.println("This is the total number of Bank Accounts " + BankAccount.getTotalNumberOfAccounts());
        sammie.depositChecking(3000);
        System.out.println("This is the Checking for Sammie: " + sammie.getChecking());
        sammie.depositSavings(5000);
        System.out.println("This is the savings for Sammie " + sammie.getSavings());
        sammie.withdrawChecking(500);
        System.out.println("This is the Checking for Sammie: " + sammie.getChecking());
        sammie.withdrawSavings(700);
        System.out.println("This is the savings for Sammie " + sammie.getSavings());
        System.out.println(sammie.getTotalOfBothAccounts());
        // Get total amount from every account Instantiated
        System.out.printf("Total Money from every active Bank Account: %s", BankAccount.getTotalMoney());

    }
}