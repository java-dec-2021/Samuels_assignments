// Add My import 
import java.util.Random;

// Set-up My class With A Verb
public class BankAccounts {

    // Set-up Some Member Variables/Attributes
    private String accountNumber;
    private double checking;
    private double savings;

    // Static (class) Attributes
    private static double totalAmount = 0;
    private static int numberOfAccounts = 0;

    // Set-up My Constructor
    public BankAccounts() {
        this.accountNumber = this.randAccountNumber();
        this.checking = 0;
        this.savings = 0;
        numberOfAccounts++;
    }

    // Method To Get 10 Random Numbers For accountNumber
    private String randAccountNumber() {
        // Have My accountNumber Variable Hold My Random 10 Numbers
        String accountNumber = "";
        // Instantiating A Random Object
        Random randNum = new Random();
        // Pull Random Number And Concat To accountNumber
        for(int i = 0; i < 10; i++) {
            // Use accountNumber To Hold Whatever Random Number Comes Back On Each Iteration
            // Concatenating Whatever Value Is Returned To My accountNumber Empty String
            // Use .concat Function To Concatenate One String To Another
            // Get The Value Of The Number As A String
            // Creating A Random Number
            accountNumber = accountNumber.concat(String.valueOf(randNum.nextInt(10)));
        }
        // Returning 1 Random 10 Digit Number In A String
        return accountNumber;
    }

    // Static (class) Method / Method To Just Get The Account Total

    // Static (class) Method To Display The totalAmount
    public String getAccountTotal() {
        return "Total Money in the Account: " + (this.getChecking() + this.getSavings());
    }

    // Getters And Setters

    // Getter For account Number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter For checking Account
    public double getChecking() {
        return this.checking;
    }

    // Getter For savings Account
    public double getSavings() {
        return this.savings;
    }

    // Getter Static (class) Method To Display The numberOfAccounts
    public static int getAccountsTotal() {
        return numberOfAccounts;
    }

    // Getter Static (class) Method To Track All Of The Money For Each Account
    public static double getTotalMoney() {
        return totalAmount;
    }

    // These Setters Are private So Administration Can Change Accounts As Needed
    // Setter For account Number
    private void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Setter For checking Account
    private void setChecking(double checking) {
        this.checking = checking;
    }

    // Setter For savings Account
    private void setSavings(double savings) {
        this.savings = savings;
    }

    // Setter Static (class) Method To Set The numberOfAccounts
    private static void setAccountsTotal(int numberOfAccounts) {
        BankAccounts.numberOfAccounts = numberOfAccounts;
    }

    // Setter Static (class) Method To Set The Total Amount Of Money For Each Account
    private static void setTotalMoney(double totalAmount) {
        BankAccounts.totalAmount = totalAmount;
    }

    // Methods To Deposit Money

    // Method To Deposit Into checking Account
    public void depositChecking(double amount) {
        BankAccounts.totalAmount += amount;
        this.setChecking(this.getChecking() + amount);
    }

    // Method To Deposit Into savings Account
    public void depositSavings(double amount) {
        BankAccounts.totalAmount += amount;
        this.setSavings(this.getSavings() + amount);
    }

    // Methods To Withdraw Money

    // Method To Withdraw From checking Account
    public void withdrawChecking(double amount) {
        if (this.getChecking() - amount >= 0) {
            BankAccounts.totalAmount -= amount;
            this.setChecking(this.getChecking() - amount);
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }

    // Method To Withdraw From savings Account
    public void withdrawSavings(double amount) {
        if (this.getSavings() - amount >= 0) {
            BankAccounts.totalAmount -= amount;
            this.setSavings(this.getSavings() - amount);
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }
}