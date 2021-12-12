// Set-up My Test File class
public class BankAccountTest {
    // Entry Point Method
    public static void main(String[] args) {
        // Create A BankAccount Object
        BankAccounts sam = new BankAccounts();
        System.out.println("This is the total number of banks " + BankAccounts.getAccountsTotal());
        sam.depositChecking(300);
        sam.depositSavings(200);
        System.out.println("This is the checking for sam " + sam.getChecking());
        System.out.println("This is the savings for sam " + sam.getSavings());
        sam.withdrawChecking(400);
        sam.withdrawSavings(200);
        System.out.println("This is the checking for sam " + sam.getChecking());
        System.out.println("This is the savings for sam " + sam.getSavings());
        System.out.println(sam.getAccountTotal());

        BankAccounts sam1 = new BankAccounts();
        System.out.println("This is the total number of banks " + BankAccounts.getAccountsTotal());
        sam1.depositChecking(300);
        System.out.println("This is the checking for sam " + sam1.getChecking());
        System.out.println("This is the savings for sam " + sam1.getSavings());
        System.out.println(sam1.getAccountTotal());
        // Gets Total Amounts For All Accounts
        System.out.println(BankAccounts.getTotalMoney());
    }
}