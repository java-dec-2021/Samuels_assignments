// Import the Imports that I need
import java.util.Random;

// Defining the Class With Noun name
public class BankAccount {

// Declaring and Defining Member Variables of Instance Variables
private double checking;
private double savings;

// Declaring and Defining Static (Class) Member Variables
private static String accountNumber = "";
private static int numberOfAccounts = 0;
private static double totaledAmountOfMoneyFromEverySingleBankAccountInstance = 0;

// Defining the Constructor with Default Values for Java
public BankAccount() {
    accountNumber = randomAccountNumber();
    this.checking = 0;
    this.savings = 0;
    numberOfAccounts++;
}

    // Static (Class) Method / Method to just Display the Total amount of money of both the Checking and Savings for administrative personnel
// Static (Class) Method to Display the Total Amount of a Both the Checking and Savings Account
public String getTotalOfBothAccounts() {
    return "Money of Both Accounts Totaled: " + (this.getChecking() + this.getSavings());
}

// Instance Method to generate 10 Random Numbers for an Account Number
private static String randomAccountNumber() {
    // Declare and Define a Variable to hold the Random 10 Digit Numbers, Also this Variable is Local to this Function
    String accountNumber = "";
    // Instantiating a Instance of the Random Class
    Random randomObject = new Random();
    // Pull Random Number And Concat To accountNumber
    for(int i = 0; i < 10; i++) {
        // Use the accountNumber Variable to hold the Random 10 Digit numbers that come from each Iteration
        // Concatenating the Value returned to the accountNumber Variables Empty String
        // Use ".concat" Instance Method from the String Class to Concatenate each Digit (That will be a "int" but I Type Casted the Variable as a "String") on each Iteration
        accountNumber = accountNumber.concat(String.valueOf(randomObject.nextInt(10)));
    }
    // Returning 1 Random 10 Digit number String
    return accountNumber;
}

    // Instance Methods to Deposit Money, And Instance Methods can access Static Variables or Methods
// Method to Deposit into Checking Account
public void depositChecking(double amount) {
    BankAccount.totaledAmountOfMoneyFromEverySingleBankAccountInstance = (BankAccount.totaledAmountOfMoneyFromEverySingleBankAccountInstance + amount);
    this.setChecking(this.getChecking() + amount);
}

// Method to Deposit into Savings Account
public void depositSavings(double amount) {
    BankAccount.totaledAmountOfMoneyFromEverySingleBankAccountInstance = (BankAccount.totaledAmountOfMoneyFromEverySingleBankAccountInstance + amount);
    this.setSavings(this.getSavings() + amount);
}

    // Instance Methods to Withdraw Money from either the Checking or Savings Accounts
// Instance Method to Withdraw from Checking Account
public void withdrawChecking(double amount) {
    if (this.getChecking() - amount < 0) {
        System.out.println("Insufficient Funds");
    }
    else {
        BankAccount.totaledAmountOfMoneyFromEverySingleBankAccountInstance = (BankAccount.totaledAmountOfMoneyFromEverySingleBankAccountInstance + amount);
        this.setChecking(this.getChecking() - amount);
    }
}

// Instance Method to Withdraw from Savings Account
public void withdrawSavings(double amount) {
    if (this.getSavings() - amount < 0) {
        System.out.println("Insufficient Funds");
    }
    else {
        BankAccount.totaledAmountOfMoneyFromEverySingleBankAccountInstance = (BankAccount.totaledAmountOfMoneyFromEverySingleBankAccountInstance + amount);
        this.setSavings(this.getSavings() - amount);
    }
}

    // Instance and Class Getters and Setters
// Getter for Account Number
public String getAccountNumber() {
    return accountNumber;
}

// Getter for Checking Account
public double getChecking() {
    return this.checking;
}

// Getter for Savings Account
public double getSavings() {
    return this.savings;
}

// Getter Static (Class) Method to Display the Number of Accounts
public static int getTotalNumberOfAccounts() {
    return numberOfAccounts;
}

// Getter Static (Class) Method to return the Calculated Money from every Account
public static double getTotalMoney() {
    return totaledAmountOfMoneyFromEverySingleBankAccountInstance;
}

    // These Setters are Private so Administration can change Accounts as needed
// Setter for Checking Account
    private void setChecking(double checking) {
        this.checking = checking;
    }

    // Setter for Savings Account
    private void setSavings(double savings) {
        this.savings = savings;
    }

    // These Static (Class) Methods can Only be access if they're Public
    // Setter Static (Class) for Account Number
    // private static void setAccountNumber(String accountNumber) {
        //     BankAccounts.accountNumber = accountNumber;
        // }

    // Setter Static (Class) Method to Set the Total Number of Accounts (if needed by administrative personnel)
//     private static void setAccountsTotal(int numberOfAccounts) {
//     BankAccounts.numberOfAccounts = numberOfAccounts;
// }

// Setter Static (Class) Method to Set the Total Amount of Money of all Accounts (if needed by administrative personnel)
// private static void setTotalMoney(double totaledAmountOfMoneyFromEverySingleBankAccountInstance) {
//     BankAccounts.totaledAmountOfMoneyFromEverySingleBankAccountInstance = totaledAmountOfMoneyFromEverySingleBankAccountInstance;
// }

}